const archivos = require("./lecturaEscritura");
let arrayProfesionales = archivos.leerJson("profesionales");

//A
arrayProfesionales.forEach( (profesional) => console.log( `${profesional.nombre} - ${profesional.especialidad}` ) );

//B
arrayProfesionales.forEach( (profesional) => profesional.honorarioConsulta = profesional.honorarioConsulta*(1+0.05) );
// console.log(arrayProfesionales)

//C
profesionalesDeshabilitados = arrayProfesionales.filter( (profesional) => !profesional.estaHabilitado );
console.log( profesionalesDeshabilitados );

//D
profesionaleHabilitados = arrayProfesionales.filter( (profesional) => profesional.estaHabilitado );
console.log( profesionaleHabilitados );

//E
arquitectos = arrayProfesionales.filter( (profesional) => profesional.especialidad === 'Arquitecto' );
console.log( arquitectos );

//F
arrayProfesionales.forEach( (profesional) => {
    for(let i=0; i<profesionalesDeshabilitados.length; i++){
        profesional === profesionalesDeshabilitados[i] ? profesional.estaHabilitado = true : profesional.estaHabilitado;
        }
    }
)
console.log(arrayProfesionales)

//G 



//H 
