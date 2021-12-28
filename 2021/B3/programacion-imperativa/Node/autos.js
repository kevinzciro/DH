const jsonHelper = require("./jsonHelper");

const carrera = {
    // A
    // Se extraen los objetos autos, con sus propiedades, del archivo autos.json
    // esto se hace a traves de la libreria jsonHeper creada con anterioridad
    autos : jsonHelper.leerArchivo('autos'),

    // B
    autosPorTanda : 6,

    // C
    autosHabilitados : function (arrayAutos = this.autos) {
        // Metodo para filtrar los autos habilitados (sacionado = false) de 
        // un arreglo de autos dado (arrayAutos). Por defecto tomara el arreglo de todos
        // los autos del archivo autos.json 
        return arrayAutos.filter( (auto) => auto.sancionado == false );
    },

    // D
    listarAutos : function(arrayAutos) {
        // Metodo para mostrar por consola el arreglo de autos arrayAutos
        // con el formato:
        // Piloto: Monah Lyal, 
        // patente: ABC123, 
        // peso en kg: 1262.7,
        // velocidad: 161km/h,
        // estado: habilitado
        arrayAutos.forEach( (auto) => {
            let habilitado = !auto.sancionado ? `habilitado` : `sancionado`;
            console.log(`
            Piloto: ${auto.piloto}, 
            patente: ${auto.patente}, 
            peso en kg: ${auto.peso},
            velocidad: ${auto.velocidad}km/h,
            estado: ${habilitado}`
            )
        }
        )
    },

    // E
    buscarPorPatente : function(patente, arrayAutos = this.autos) {
        // Metodo para hallar un auto en una lista de autos (arrayAutos) a traves de su patente.
        // Por defecto arrayAutos tomara el arreglo de todos los autos del archivo autos.json.
        return arrayAutos.find( (auto) => auto.patente === patente )
    },

    // F
    filtrarPorCilindrada :  function(cilindrada, arrayAutos = this.autosHabilitados()) {
        // Metodo para filtrar los autos que tengan cilindraje menor o igual a cilindrada dentro
        // de un array de autos arrayAutos.
        // Por defecto arrayAutos tomara el arreglo de todos los autos habilitados (sacionado = false) 
        // del archivo autos.json.
        return arrayAutos.filter( (auto) => auto.cilindrada <= cilindrada )
    },

    // G
    ordenarPorVelocidad : function( arrayAutos = this.autos ) {
        // 
        return arrayAutos.sort( (a,b) => a.velocidad - b.velocidad )
    },

    // H
    habilitarVehiculo : function (patente){
        auto = this.buscarPorPatente(patente);
        auto.sancionado ? 
        auto.sancionado=!auto.sancionado : 
        auto.sancionado=auto.sancionado;
        jsonHelper.escribirArchivo('autos', this.autos)
        return auto
    },

    // I
    generarTanda : function ( cilindrada, peso, arrayAutos = this.autosHabilitados() ){
        return this.filtrarPorCilindrada(cilindrada, arrayAutos).filter(
            (auto) => auto.peso <= peso).slice(0, this.autosPorTanda)
    },

    // J
    pesoPromedio : function(cilindrada, peso){
        let sumatoriaHabilitados = this.generarTanda(cilindrada, peso).reduce(
            (acum, auto) => acum + auto.peso,
            0
        );
        let promedio = sumatoriaHabilitados / this.generarTanda(cilindrada, peso).length;
        return `El peso promedio de los vehiculos habilitados es de: ${promedio}Kg`;
        },

        // K
    listarPodio : function( cilindrada, peso, arrayAutos=this.autosHabilitados() ){
        let ganadores = this.generarTanda( cilindrada, peso, arrayAutos ).sort(
                (a,b) => b.puntaje - a.puntaje
                ).slice(0,3);
        console.log(`El ganador es ${ganadores[0].piloto}, con un puntaje de ${ganadores[0].puntaje}.`);
        console.log(`El segundo puesto es para ${ganadores[1].piloto}, con un puntaje de ${ganadores[1].puntaje}.`);
        console.log(`El tercer puesto es para ${ganadores[2].piloto}, con un puntaje de ${ganadores[2].puntaje}.`);
    },

}


// carrera.listarAutos( carrera.autosHabilitados() )
// console.log(carrera.buscarPorPatente("JOK851"))
// carrera.listarAutos( carrera.filtrarPorCilindrada(2000) )
// carrera.listarAutos( carrera.ordenarPorVelocidad() ) 
// carrera.habilitarVehiculo("JHV223")
// carrera.listarAutos( carrera.generarTanda(2000, 2000) )
// console.log( carrera.pesoPromedio(2000, 2000) )
// console.log( carrera.listarPodio(2000, 2000) )
carrera.listarPodio(2000, 2000)