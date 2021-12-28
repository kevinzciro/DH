const jsonHelper = require("./jsonHelper.js");

const concesionaria = {
    vehiculos: jsonHelper.leerArchivo("AUTOS"),

    incrementarPrecio: function (porcentaje) {
        let aux = porcentaje / 100 + 1;
        for (let i = 0; i < this.vehiculos.length; i++) {
            const vehiculo = this.vehiculos[i];
            vehiculo.precio *= aux;
        }
        jsonHelper.escribirArchivo("AUTOS", this.vehiculos);
        return `Los vehiculos aumentaron un %${porcentaje}`;
    },

    agregarAuto : function(marca, modelo, anio, precio, patente){
        let carroNuevo = 
            {
            marca : marca,
            modelo : modelo,
            anio : anio,
            precio : precio,
            patente : patente,
            vendido : false
        };

        this.vehiculos.push(carroNuevo);

        jsonHelper.escribirArchivo("AUTOS", this.vehiculos);
    },

    venderAuto : function(patente) {
        for (let i=0; i< this.vehiculos.length; i++) {
            if (patente === this.vehiculos[i].patente) {
                if ( !this.vehiculos[i].vendido ){
                    this.vehiculos[i].vendido = true
                    jsonHelper.escribirArchivo("AUTOS", this.vehiculos);
                    return `Se vendio el vehiculo con patente ${patente}`;
                }
            }
        }
    }
};

// console.log(concesionaria.vehiculos);
// concesionaria.agregarAuto('Dodge','Dakota', 1995, 574793, 'WAV702');
console.log(concesionaria.venderAuto('WAV703'));

