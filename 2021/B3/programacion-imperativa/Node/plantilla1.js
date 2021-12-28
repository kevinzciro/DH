const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);
// Te proveemos la siguiente plantilla que tiene tre partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "tu nombre aquí";
const tema = "el tema que te tocó";

const departamentos = [
  {
    id: 1,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 2395.8
  },
  {
    id: 2,
    propietarios: "Dueños: Luis Perez y María Martinez",
    cantidadHabitacion: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 1597.2
  },
  {
    id: 3,
    propietarios: "Dueña: Laura García",
    cantidadHabitacion: 2,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 4,
    precioAlquiler: 3993
  },
  {
    id: 4,
    propietarios: "Dueña: Julieta Tols",
    cantidadHabitacion: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 1996.5
  },
  {
    id: 5,
    propietarios: "Dueños: Julieta Tols y Pablo Groming",
    cantidadHabitacion: 1,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 1,
    precioAlquiler: 11979
  },
  {
    id: 6,
    propietarios: "Dueño: Pablo Groming",
    cantidadHabitacion: 2,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 4658.5
  },
  {
    id: 7,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 3327.5
  },
  {
    id: 8,
    propietarios: "Dueña: Julieta Tols",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 9,
    propietarios: "Dueñas: Julieta Tols y Laura García",
    cantidadHabitacion: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 10,
    propietarios: "Dueñas: Julieta Tols y Laura García",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 11,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 12,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 13,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 4059.55
  },
  {
    id: 14,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 3993
  },
  {
    id: 15,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 798.6
  },
  {
    id: 16,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 798.6
  },
  {
    id: 17,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 665.5
  }
]


/*******************************/
/* Desarrollo de las consignas */
/*******************************/

// A

let inmobiliaria = {

  departamentos : departamentos,

  // B
  listarDepartamentos : function(arrayDptos){
      for (let i = 0; i < arrayDptos.length; i++){
        let disponibilidad = arrayDptos[i].disponible ? 'Disponoble' : 'Alquilado';
        let mascotas = arrayDptos[i].aceptaMascotas ? 'acepta' : 'no acepta';

        console.log( 'id: ' + arrayDptos[i].id + ', precio $ ' + arrayDptos[i].precioAlquiler +  ', está ' + disponibilidad + ', ' +  arrayDptos[i].cantidadHabitacion + ' ambientes, máximo ' + arrayDptos[i].cantidadPersonas + ' personas, ' + mascotas + ' mascotas , ' +  arrayDptos[i].propietarios);
    }
  },

  // C
  departamentosDisponibles : function(){
    
    let disponibles = [];
    
    for(let i=0; i<this.departamentos.length; i++){
      if (this.departamentos[i].disponible){
        disponibles.push(this.departamentos[i]);
      }
    }
    return disponibles;
  },

  // D
  buscarPorId : function(identificador){
    let dptoEncontrado = [];
    for( let i = 0; i < this.departamentos.length; i++ ) {
      if ( this.departamentos[i].id === identificador ) {  
        dptoEncontrado.push(this.departamentos[i]);
      }
    }
    return dptoEncontrado;
  },

  // E
  buscarPorPrecio : function(precioDeseado){
    let dptosEncontrados = [];
    for( let i = 0; i < this.departamentosDisponibles().length; i++ ) {
      if ( this.departamentosDisponibles()[i].precioAlquiler <= precioDeseado) {  
        dptosEncontrados.push(this.departamentosDisponibles()[i]);
      }
    }
    return dptosEncontrados;
  },

  // F
  precioConImpuesto : function(porcentaje) { 
    let porcentajeFinal = 1 + (porcentaje/100)
    for(let i = 0; i < this.departamentos.length; i++){
      this.departamentos[i].precioAlquiler = this.departamentos[i].precioAlquiler * porcentajeFinal
    }
    return this.departamentos
  },
  
  // G
  simplificarPropietarios: function () {
    for (let i = 0; i < this.departamentos.length; i++) {
      this.departamentos[i].propietarios=this.departamentos[i].propietarios.replace('Dueños:', 'Prop.:')
      this.departamentos[i].propietarios=this.departamentos[i].propietarios.replace('Dueñas:', 'Prop.:')
      this.departamentos[i].propietarios=this.departamentos[i].propietarios.replace('Dueña:', 'Prop.:')
      this.departamentos[i].propietarios=this.departamentos[i].propietarios.replace('Dueño:', 'Prop.:')
    }
    return this.departamentos;
  },

  alquilar : function(identificador){
    if (this.departamentos[identificador].disponible){
      this.departamentos[identificador].disponible = false
      return ('Se alquilo el dpto nro: ' + identificador)
    }
    else{
      return 'No esta disponible'
    }
  },

  filtrarPetFriendly : function(){
    let permitenMascotas = []
    for(let i =0; i < this.departamentos.length; i++){
      if (this.departamentos[i].aceptaMascotas ){
        permitenMascotas.push(this.departamentos[i])
      }
    }
    return permitenMascotas
  }, 

  rebajasPorNoAlquiler : function(){
    let descuentoAlquiler = []
    for ( let i =0; i < this.departamentosDisponibles().length; i++ ){
      descuentoAlquiler.push(this.departamentosDisponibles()[i].precioAlquiler * 0.9)
    }
    return descuentoAlquiler
  }

}




/******************************/
/* Ejecución de las consignas */
/******************************/
// console.table([{ alumno: nombre, tema: tema }]);

// console.log(v, "\n" + oo + "   B. listarDepartamentos");
// inmobiliaria.listarDepartamentos(inmobiliaria.departamentos);
// console.log(o);

// console.log(v, oo + "   C. departamentosDisponibles");
// // Ejecución aquí
// inmobiliaria.listarDepartamentos(inmobiliaria.departamentosDisponibles());
// console.log(o);

// console.log(v, oo + " D. buscarPorId");
// // Ejecución aquí
// inmobiliaria.listarDepartamentos(inmobiliaria.buscarPorId(10));
// console.log(o);

// console.log(v, oo + "  E. buscarPorPrecio");
// // Ejecución aquí
// inmobiliaria.listarDepartamentos(inmobiliaria.buscarPorPrecio(800));
// console.log(o);

// console.log(v, oo + " F. precioConImpuesto");
// // Ejecución aquí
// inmobiliaria.listarDepartamentos(inmobiliaria.precioConImpuesto(10))
// console.log(o);

console.log(v, oo + " G. simplificarPropietarios");
// Ejecución aquí
inmobiliaria.listarDepartamentos(inmobiliaria.simplificarPropietarios())
console.log(o);

// console.log(v, oo);
// // Ejecución aquí
// console.log(inmobiliaria.alquilar(0))
// console.log(o);

// // Ejecución aquí
// inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPetFriendly())
// console.log(o);

// console.log(v, oo);
// // Ejecución aquí
// console.log(inmobiliaria.rebajasPorNoAlquiler())
// console.log(o);