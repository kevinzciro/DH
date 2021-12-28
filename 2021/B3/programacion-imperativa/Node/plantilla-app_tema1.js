const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);
// Te proveemos la siguiente plantilla que tiene tres partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Kevin Albeiro Zapata Ciro";
const tema = "TEMA 1";

const profesionales = [
  {
    id: 0,
    estaHabilitado: false,
    honorarioConsulta: 2007.68,
    edad: 29,
    nombre: "huber Wilkins",
    email: "huberwilkins@speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 0,
    puntaje: 8,
  },
  {
    id: 1,
    estaHabilitado: true,
    honorarioConsulta: 2325.56,
    edad: 21,
    nombre: "goldie Haley",
    email: "goldiehaley@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 0,
    puntaje: 7,
  },
  {
    id: 2,
    estaHabilitado: false,
    honorarioConsulta: 2208.17,
    edad: 36,
    nombre: "pena Landry",
    email: "penalandry@speedbolt.com",
    especialidad: "Dermatologia",
    cantidadConsultas: 0,
    puntaje: 7,
  },
  {
    id: 3,
    estaHabilitado: false,
    honorarioConsulta: 3266.71,
    edad: 20,
    nombre: "leanne Burch",
    email: "leanneburch@speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 1,
    puntaje: 5,
  },
  {
    id: 4,
    estaHabilitado: false,
    honorarioConsulta: 2674.09,
    edad: 31,
    nombre: "haynes Fuentes",
    email: "haynesfuentes@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 0,
    puntaje: 4,
  },
  {
    id: 5,
    estaHabilitado: true,
    honorarioConsulta: 1851.37,
    edad: 27,
    nombre: "tamika Fuentes",
    email: "tamikanewman@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 0,
    puntaje: 6,
  },
  {
    id: 6,
    estaHabilitado: true,
    honorarioConsulta: 2568.94,
    edad: 34,
    nombre: "russo Baldwin",
    email: "russobaldwin@speedbolt.com",
    especialidad: "Dermatologia",
    cantidadConsultas: 4,
    puntaje: 10,
  },
  {
    id: 7,
    estaHabilitado: true,
    honorarioConsulta: 2601.76,
    edad: 36,
    nombre: "dodson Shaffer",
    email: "dodsonshaffer@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 0,
    puntaje: 0,
  },
  {
    id: 8,
    estaHabilitado: true,
    honorarioConsulta: 1949.92,
    edad: 40,
    nombre: "guerra Bright",
    email: "guerrabright@speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 8,
    puntaje: 0,
  },
  {
    id: 9,
    estaHabilitado: true,
    honorarioConsulta: 3898.11,
    edad: 20,
    nombre: "dina Navarro",
    email: "dinanavarro@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 6,
    puntaje: 8,
  },
  {
    id: 10,
    estaHabilitado: false,
    honorarioConsulta: 2745.73,
    edad: 27,
    nombre: "stafford Watts",
    email: "staffordwatts@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 0,
    puntaje: 6,
  },
  {
    id: 11,
    estaHabilitado: false,
    honorarioConsulta: 2808.98,
    edad: 39,
    nombre: "joni Avery",
    email: "joniavery@speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 3,
    puntaje: 9,
  },
  {
    id: 12,
    estaHabilitado: true,
    honorarioConsulta: 1941.13,
    edad: 21,
    nombre: "mayra Tran",
    email: "mayratran@speedbolt.com",
    especialidad: "Oftamologia",
    cantidadConsultas: 8,
    puntaje: 3,
  },
  {
    id: 13,
    estaHabilitado: false,
    honorarioConsulta: 3930.0344999999998,
    edad: 23,
    nombre: "ward Dale",
    email: "warddale@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 1,
    puntaje: 3,
  },
];

/*******************************/
/* Desarrollo de las consignas */
/*******************************/



const appProfesionales = {
  // A
  profesionales : profesionales,

  // B
  listarProfesionales : function(arrayProfesionales){
    // Metodo para imprimir por pantalla la lista de profesionales (objetos) dados.
    for (let i = 0; i < arrayProfesionales.length; i++){
      let activo = arrayProfesionales[i].estaHabilitado ? 'ok' : 'inactivo';
      console.log(`id ${arrayProfesionales[i].id} ${activo}, ${arrayProfesionales[i].especialidad}, ${arrayProfesionales[i].nombre}, valor consulta $${arrayProfesionales[i].honorarioConsulta}, puntaje: ${arrayProfesionales[i].puntaje}`);
    }
  },

  // C
  filtrarMejoresPuntajes : function(){
    // Metodo para filtrar los puntajes (propiedad) mayores o iguales a 7 de
    // los profesionales (objetos) dados.
    mejoresPuntajes = [];
    for (let i = 0; i < this.profesionales.length; i++) {
      if (this.profesionales[i].puntaje >= 7){
        mejoresPuntajes.push(profesionales[i])
      }
    }
    if (mejoresPuntajes.length > 0){
      return mejoresPuntajes;
    }
    else{
      return 'No hay profesionales con calificaciones mayores a 7';
    }
  },

  // D
  buscarPorID : function(identificador){
    // Metodo para algun profesional por id (identificador).
    // En caso de no encontrarse el profesional retorna mensaje de error de id.
    // En caso de que se pueda habilitar se retorna el (obejto) profesional buscado.
    let profesional;
    let mensajeError = `No se pudo encontrar el id ${identificador}`;

    for (let i = 0; i < this.profesionales.length; i++) {
      if (this.profesionales[i].id === identificador) {
        profesional = this.profesionales[i];
      }
    }

    if(profesional){
      return profesional;
    }
    else{
      return mensajeError;
    }
  },

  // E
  habilitarProfesional : function(identificador){
    // Metodo para habilitar (poner la propiedad estHalitado como true) de
    // algun profesional por medio de un id (identificador) que se encuentre en la base de objetos dados.
    // En caso de no encontrarse el profesional retorna mensaje de error de id.
    // En caso de que se pueda habilitar se indica que se habilito.
    let profesional = this.buscarPorID(identificador);

    if (typeof(profesional) === 'string') {
      return profesional;
    }

    // falto un if para verificar que el profesional no este ya habilitado!
    else if ( profesional.estaHabilitado === true ){
      return `El profesional con id ${identificador} ya esta habilitado`;
    }

    else{
      this.profesionales[identificador].estaHabilitado = true;
      return `Se habilito el profesional con id ${identificador}`;
      // return this.profesionales[identificador];
    }
  },

  // F
  corregirNombres : function(){
    // Metodo para poner la primera letra del nombre en mayusculas de los profesionales dados.
    for(let i = 0; i<this.profesionales.length; i++){
      let primeraLetra = this.profesionales[i].nombre[0];
      let primeraLetraMayuscula = this.profesionales[i].nombre[0].toUpperCase();
      this.profesionales[i].nombre = this.profesionales[i].nombre.replace(primeraLetra, primeraLetraMayuscula);
    }
    return this.profesionales;
  }
}



/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]);

console.log(v, "\n" + oo + "   B. listarProfesional");
// Ejecución aquí
appProfesionales.listarProfesionales(appProfesionales.profesionales)
console.log(o);

console.log(v, oo + "   C. filtrarMejoresPuntajes");
// Ejecución aquí
appProfesionales.listarProfesionales(appProfesionales.filtrarMejoresPuntajes())
console.log(o);

console.log(v, oo + " D. buscarPorId(1)");
// Ejecución aquí
console.log(appProfesionales.buscarPorID(3))
// El console. log siguiente es para probar mensaje de error
console.log(appProfesionales.buscarPorID(20))
console.log(o);

console.log(v, oo + "  E. habilitarProfesional");
// Ejecución aquí
console.log(appProfesionales.habilitarProfesional(0))
// El console. log siguiente es para probar mensaje de error
console.log(appProfesionales.habilitarProfesional(9))
console.log(appProfesionales.habilitarProfesional(20))
console.log(o);

console.log(v, oo + " F. corregirNombres");
// Ejecución aquí
appProfesionales.listarProfesionales(appProfesionales.corregirNombres())
console.log(o);