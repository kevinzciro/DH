const jsonHelper = require('./jsonHelper');

const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

// A
carrera = {
    // B
    bicicletas : jsonHelper.leerJson('bicicletas'),

    // C
    bicicletasPorTanda : 4,

    // D
    ciclistasHabilitados : function() {
        return this.bicicletas.filter( (bicicleta) => bicicleta.dopaje===false );
    },

    // E
    listarBicicletas : function(arrayBicicletas) {
        arrayBicicletas.forEach( Bicicleta => {
            let estado = Bicicleta.dopaje ? 'inhabilitado' : 'habilitado';
            console.log(`Ciclista: ${Bicicleta.ciclista}, marca: ${Bicicleta.marca},  rodado: ${Bicicleta.rodado}, peso: ${Bicicleta.peso}kg, largo: ${Bicicleta.largo}cm, estado: ${estado}.`);
        });
    },

    // F
    buscarPorId : function(identificador, arrayBicicletas=this.bicicletas) {
        return arrayBicicletas.find( (bicicleta) => bicicleta.id === identificador );
    },

    // G
    filtrarPorPeso : function(peso, arrayBicicletas=this.ciclistasHabilitados()) {
        return arrayBicicletas.filter( (ciclista) => ciclista.peso <= peso );
    },

    // H
    ordenarPorRodado : function(arrayBicicletas=this.bicicletas){
        return arrayBicicletas.sort( (a,b) => a.rodado-b.rodado );
    },

    // I
    largoPromedio : function(arrayBicicletas=this.bicicletas) {
        let sumaLargosTotal = arrayBicicletas.reduce( (acum, bicicleta) => acum+bicicleta.largo, 0 );
        let promedio = sumaLargosTotal/arrayBicicletas.length
        return `El promedio del largo de todas las bicicletas es: ${promedio}`
    },

    // J
    aumentarPeso : function(pesoAumentar, identificador) {
        let encontrado = this.buscarPorId(identificador)
        if (encontrado){
            encontrado.peso += pesoAumentar
            jsonHelper.escribirJson('bicicletas', this.bicicletas)
        }
        return encontrado
    },

    // K
    generarTanda : function(pesoMin, rodadoMax, arrayBicicletas=this.ciclistasHabilitados()){
        return arrayBicicletas.filter( (ciclista) => ciclista.peso >= pesoMin && ciclista.rodado <= rodadoMax
        ).slice(0, this.bicicletasPorTanda);
    },

    // L
    calcularPodio : function(pesoMin, rodadoMax){
        let ganadores = this.generarTanda(pesoMin, rodadoMax).sort( (a,b) => b.puntaje-a.puntaje )
        console.log( `El ganador es: ${ganadores[0].ciclista}, con un puntaje de ${ganadores[0].puntaje}.` )
        console.log( `El segundo puesto es para ${ganadores[1].ciclista}, con un puntaje de ${ganadores[1].puntaje}.` )
        console.log( `El tercer puesto es para ${ganadores[2].ciclista}, con un puntaje de ${ganadores[2].puntaje}.` )
    },

}

/******************************/
/* Ejecución de las consignas */
/******************************/

console.log(v, "\n" + oo + " .D. ");
carrera.listarBicicletas(carrera.ciclistasHabilitados())
console.log(o);

console.log(v, oo + " .E.");
carrera.listarBicicletas(carrera.bicicletas)
console.log(o);

console.log(v, oo + " .F.");
console.log( carrera.buscarPorId(1) )
console.log(o);

console.log(v, oo + " .G.");
carrera.listarBicicletas(carrera.filtrarPorPeso(10))
console.log(o);

console.log(v, oo + " .H.");
carrera.listarBicicletas(carrera.ordenarPorRodado())
console.log(o);

console.log(v, oo + " .I.");
console.log( carrera.largoPromedio() )
console.log(o);

console.log(v, oo + " .J. ");
console.log( carrera.aumentarPeso(10, 1) )
console.log(o);

console.log(v, oo + " .K. ");
carrera.listarBicicletas(carrera.generarTanda(5, 50))
console.log(o);

console.log(v, oo + " .L. ");
carrera.calcularPodio(5,50)
console.log(o);
