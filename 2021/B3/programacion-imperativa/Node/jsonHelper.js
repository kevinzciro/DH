const fs = require("fs");

const jsonHelper = {

    leerArchivo: function (nombreArchivo) 
    // Lee un archivo .json creado en la misma carpeta y lo transforma en un objeto.
    // Es decir toma el archivo nombreArchivo.json y retorna los objetos de este.
    {
        return JSON.parse(fs.readFileSync(`${__dirname}/${nombreArchivo}.json`, "utf8"));
    },

    escribirArchivo: function (nombreArchivo, datos)
    // Crea o sobreescribe el archivo de formato 'nombreArchivo'.json con los datos pasados (generalmente objetos)
    // en la carpeta de trabajo actual.
    {
        fs.writeFileSync(`${__dirname}/${nombreArchivo}.json`, JSON.stringify(datos));
    },

};

module.exports = jsonHelper;