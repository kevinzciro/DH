const jsonHelper = require("./lecturaEscritura");

const inmobiliaria = {
departamentos: jsonHelper.leerJson("DEPARTAMENTOS"),
    listarDepartamentos: function (arrDeptos) {
        arrDeptos.forEach((depto) => {
            let disponibilidad = depto.disponible ? "disponible" : "alquilado";
            console.log(
            `id: ${depto.id}, precio $${depto.precioAlquiler}, está ${disponibilidad}, ${depto.ambientes} ambientes`
            );
        });
    },

    buscarPorId: function (id) {
    return this.departamentos.find((depto) => depto.id === id);
    },

    departamentosNoDisponibles: function () {
        return this.departamentos.filter((depto) => !depto.disponible);
    },

    departamentosDisponibles : function(){
        return this.departamentos.filter((depto) => depto.disponible);
    },

    filtrarPorAmbientes : function(cantidadAmbientes){
        return this.departamentos.filter((depto) => depto.ambientes >= cantidadAmbientes);
    },

    filtrarPorPrecio : function(valorAlquiler){
        return this.departamentosDisponibles().filter((depto) => depto.precioAlquiler <= valorAlquiler);
    },

    rebajarPrecioAlquiler : function( porcentaje ) {
        this.departamentosDisponibles().forEach( (depto) => depto.precioAlquiler = depto.precioAlquiler*( 1 - porcentaje/100) );
        
        return jsonHelper.escribirJson('DEPARTAMENTOS',this.departamentos)
        // return this.departamentosDisponibles()
    },

    calcularRecaudación: function () {
        let alquilados = this.departamentosDisponibles();
        let valor = alquilados.reduce(
        (acum, depto) => acum + depto.precioAlquiler,
        0
    );
        return `La recaudacion total es de: $${valor}`;
    },

    ordenarPorPrecio : function( arrayDeptos = this.departamentos ) {
        return arrayDeptos.sort( (a,b) => a.precioAlquiler - b.precioAlquiler )
    },

};

// console.log(inmobiliaria.departamentos);
// inmobiliaria.listarDepartamentos(inmobiliaria.departamentos);
// console.log(inmobiliaria.buscarPorId(10));
// console.log(inmobiliaria.buscarPorId(100));
// inmobiliaria.listarDepartamentos(inmobiliaria.departamentosNoDisponibles());
// console.log(inmobiliaria.calcularRecaudación());
// inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPorAmbientes(100));
// inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPorPrecio(115000));
inmobiliaria.listarDepartamentos(inmobiliaria.ordenarPorPrecio())