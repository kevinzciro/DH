const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR
// Te proveemos la siguiente plantilla que tiene dos partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Kevin Zapata";
const tema = "Tema 2";

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

const jsonHelper = require('./jsonHelper')

// A
con
let gestionDePeliculas = {
    // B
    peliculas : jsonHelper.leerJson('peliculas'),

    // C
    listarPelículas : function( arrayPeliculas ){
        // Metodo que imprime en pantalla un array de peliculas dado (arrayPeliculas) en la forma:
        // The Mist, de Frank Darabont. Duración: 126 minutos, Sci-Fi, (7.1 / 10 en IMDB)
        arrayPeliculas.forEach( pelicula => { 
            console.log(`${pelicula.titulo}, de ${pelicula.director}. Duración: ${pelicula.duracion} minutos, ${pelicula.genero}, (${pelicula.calificacionIMDB} / 10 en IMDB)`);
        });
    },

    // D
    buscarPorId : function(identificador){
        // Metodo que encuentra una pelicula dado su identificador unico.
        // En caso de no encontrar la pelicula con el ideentificador deseado devuelve Undefined.
        return this.peliculas.find( pelicula => pelicula.id ===identificador );
    },

    // E
    peliculasPorGenero : function( generoDeseado ) {
        // Metodo que filtra las peliculas segun un genero dado (generoDeseado) y devuelve un array solo con las peliculas de este genero.
        // En caso de no encontrar ninguna pelicula devuelve array vacio.
        return this.peliculas.filter( pelicula => pelicula.genero === generoDeseado );
    },

    // F
    filtrarPorCalificacion : function( calificacionMin, calificacionMax ) {
        // Metodo que filtra las peliculas segun una calificacion minima (calificacionMin) y una calificacion maxima (calificacionMax)
        // y devuelve un array solo con las peliculas deentro del rango de calificaciones [calificacionMin, calificacionMax]
        // En caso de no encontrar ninguna pelicula devuelve array vacio.
        return this.peliculas.filter( pelicula => pelicula.calificacionIMDB >= calificacionMin && pelicula.calificacionIMDB <= calificacionMax );
    },
    
    // G
    ordenarPorDuracion : function() {
        // Meotodo para ordenar todas las peliculas segun su duracion, de mayor a menor.
        return this.peliculas.sort( (a, b) => b.duracion-a.duracion );
    },

    // H
    duracionPromedio : function() {
        // Metodo para hallar la duracion promedio de todas las peliculas.
        let promedio =this.peliculas.reduce( (acum, pelicula) => acum+pelicula.duracion, 0) / this.peliculas.length;
        return `El promedio de duración de las películas es de: ${promedio} minutos`;
    },

    // I
    modificarGeneroPorId : function(identificador, nuevoGenero){
        // Metodo para cambiar el genero de una pelicula por otro genero (nuevoGenero);
        // para hacer lo anterior se filtra la pelicula por id (idedntificador).
        // En caso de no encontrar la pelicula devuelve Undefined. 
        let peliculaFiltrada = this.buscarPorId(identificador);
        if (peliculaFiltrada) {
            peliculaFiltrada.genero = nuevoGenero;
            jsonHelper.escribirJson('peliculas', this.peliculas);
        }
        return peliculaFiltrada;
    },
}

/******************************/
/* Ejecución de las consignas */
/******************************/

console.table([{ alumno: nombre, tema: tema }]); // NO MODIFICAR NADA DE ESTA LINEA

console.log(v, "\n" + oo + " .C. Listar");
gestionDePeliculas.listarPelículas(gestionDePeliculas.peliculas)
console.log(o);

console.log(v, oo + " .D. Buscar");
// si encuentra el id devuelve el objeto literal
console.log( gestionDePeliculas.buscarPorId(1) )
// si no encuentra el id devuelve undefined
console.log( gestionDePeliculas.buscarPorId(11) )
console.log(o);

console.log(v, oo + " .E. Filtrar 1");
gestionDePeliculas.listarPelículas(gestionDePeliculas.peliculasPorGenero("Drama"))
console.log(o);

console.log(v, oo + " .F. Filtrar 2");
// Si encuentra peliculas imprime algo y se usa listarPeliculas
gestionDePeliculas.listarPelículas(gestionDePeliculas.filtrarPorCalificacion(7,10))
// Si no encuentra peliculas devuelve array vacio [], para verificarlo uso console.log
console.log(gestionDePeliculas.filtrarPorCalificacion(10,10))
console.log(o);

console.log(v, oo + " .G. Ordenar");
gestionDePeliculas.listarPelículas(gestionDePeliculas.ordenarPorDuracion())
console.log(o);

console.log(v, oo + " .H. Duracion");
console.log( gestionDePeliculas.duracionPromedio() )
console.log(o);

console.log(v, oo + " .I. Modificar Propiedad");
// Se cambia el genero de la pelicula con id 1 de Drama a Comedia
gestionDePeliculas.modificarGeneroPorId(1, "Comedia")
console.log( gestionDePeliculas.buscarPorId(1) )
// Para probar que retorne undefined si no encuentra el id dado
console.log(gestionDePeliculas.modificarGeneroPorId(11, "Comedia"))
console.log(o);
