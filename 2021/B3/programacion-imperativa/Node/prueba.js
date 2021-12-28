// var nombre = 'Kevin';

// let edad = 24;

// const apellido = 'Zapata'

// console.log('Hola', nombre+' '+apellido+'.', 'Tu edad es de:', edad);

// console.log(typeof(apellido));

// var varBoba1, varBoba2;

// console.log(typeof(varBoba1));

// function factorial(n){
    // if (n == 1) {
        // return n;
    // }
    // else{
        // return n*factorial(n-1);
    // }
// }

// console.log(factorial(3))

// nombres = ['Nicolas Lopez', 'Esteban Piazza', 'Jose Fermoso', 'Juana Fernandez', 'Kevin Zapata'];
// edades = [27, 28, 33, 26, 24];
// masas = [83.5, 80.1, 63.7, 55.0, 63.0];
// alturas = [1.70, 1.76, 1.53, 1.62, 1.75];

// console.log(edades)

// console.log(edades.reverse())


// let foo;
// for (let i = 0; i<Math.round(edades.length*0.5); i++){
    // foo = edades[i];
    // edades[i] = edades[edades.length - 1 - i];
    // edades[edades.length - i - 1] = foo;
// }

// console.log(edades);


// function test2(x, y){
    // return x*2
    // console.log(x)
    // return x/2
// }



// function inch2cm(x){
//     // Funcion que recibe un numero x en pulgadas
//     // y devuelve en valor de x en centrimetros
//     return(x*2.54)
// }

// function name2link(str){
//     // funcion que recibe un string y me devuelve un 'link' con ese string
//     // por ejemplo, si se le da hola, retorna www.hola.com
//     return('www.' + str + '.com')
// }

// function exclamation(str){
//     // Recibe un string y devuelve el mismo string con signo de admiracion
//     return(str+'!')
// }

// function dogsAge2humanAge(dogAge){
//     // recibe la edad (en años) de un perro y devuelve su equivalente en 
//     // edad humana, se tiene en cuenta que 1 año para perros son 
//     // 7 años humanos
//     return(7*dogAge)
// }

// function hourValue(mensualSalary){
//     // Recibe el salario neto mensual y devuelve el salario por hora
//     // Se tiene en cuenta que solo se trabaja 40 horas al mes
//     return(mensualSalary/40)
// }

// function IMC(masa, altura){
//     // Recibe la masa en kg y la altura en m, y retorna el IMC
//     return( masa/(altura*altura) )
// }

// function UpperCase(str){
//     // Transforma str a mayusculas
//     return( str.toUpperCase() )
// }

/*
function type(n){
    // Indica el tipo de variable
    return(typeof(n))
}
*/


// function circunference(r){
//     // Calcula la circunferencia de un circulo de radio r
//     return(2*Math.PI*r)
// }


// function tengoClases(dia) {
// 	switch (dia) {
// 		case 'lunes':
// 			console.log('tenés clases');
// 			break;
// 		case 'miércoles':
// 			console.log('tenés clases');
// 			break;
// 		case 'viernes':
// 			console.log('tenés clases');
// 			break;
// 		default: 
// 			console.log('no tenés clases');
// 			break;
// 	}
// }

// tengoClases('sabado')

/*
let str = ""
let msj = "jaja!"
let esGracioso = "false"
console.log(!((str || msj) && esGracioso))
*/

/*
let type = typeof 'Martin' === 'string'
    ? 'Es un string'
    : 'No es un string '

console.log(type)
*/

/*
console.log(typeof(null))

function cuadradoDeUnNumero(numero){
    if (typeof numero === 'number'){
        return numero*numero 
    }
    else{
        return "No es posible operar con el tipo de dato " + typeof(numero) 
    }
}


console.log(cuadradoDeUnNumero(2.1))
console.log(cuadradoDeUnNumero('a'))
*/

// let estudiantes = [
//     {
//         nombre: 'Alvaro',
//         promedio : 9,
//         curso : 'Android',
//     },
//     {
//         nombre: 'Daniel',
//         promedio : 6,
//         curso : 'Full Stack',
//     },
//     {
//         nombre: 'Alexis',
//         promedio : 3,
//         curso : 'iOS',
//     },
// ]

// console.log(estudiantes)

// estudiantes.push(
//     {
//         nombre: 'Juan',
//         promedio: 5,
//         curso: 'iOS',
//     },
//     {
//         nombre: 'Miguel',
//         promedio: 2,
//         curso: 'Android',
//     }
// )

// console.log(estudiantes)

// let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]

// function mayusculas(arr){
//     arr.forEach( function(element, index, array){
//         array[index] = element.toUpperCase()
//     } )
//     return arr
// }

// peliculas = mayusculas(peliculas)

// peliculas2 = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]

// function unir(arr1, arr2){
//     return mayusculas(arr1.concat(arr2))
// }

// peliculas = unir(peliculas, peliculas2)

// let ultimo = peliculas.pop()

// const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
// const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

// function comparacionCalificaciones(cal1, cal2){
//     let arr = []
//     cal1.forEach( function(element, index) {
//         if (element === cal2[index]){
//             arr.push('Son iguales')
//         }
//         else{
//             arr.push('Son diferentes')
//         }
//     } )
//     return arr
// }

// console.log(peliculas)
// console.log(comparacionCalificaciones(asiaScores, euroScores))


// function mayusculas2( array, array1 = [] ) {
//     let length = array.length - 1

//     if (length === 0){
//         array1.unshift( array[length].toUpperCase() )
//     }
//     else{
//         array1.unshift( array[length].toUpperCase() )

//         array.splice(length, 1)
//         array1.concat( mayusculas2(array, array1) )
//     }

//     return array1
// }

// function unir(arr1, arr2){
//     return mayusculas2(arr1.concat(arr2))
// }


// let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]
// let peliculas2 = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]

// peliculas = unir(peliculas, peliculas2)

// let ultimo = peliculas.pop()

// const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
// const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

// let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]
// let peliculas2 = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]

// function mayusculas(arr){
//     for(let i=0; i <= arr.length-1; i++){
//         arr[i] = arr[i].toUpperCase()
//     }
//     return arr
// }

// peliculas = mayusculas(peliculas)

// function pasajeDeElementos(arr1, arr2){
//     for(let i=0; i <= arr2.length-1; i++){
//         arr1.push(arr2[i])
//     }
//     return mayusculas(arr1)
// }

// peliculas = pasajeDeElementos(peliculas, peliculas2)

// let ultimo = peliculas.pop()

// console.log(peliculas)

// function comparacionCalificaciones(cal1, cal2){
//     let comp = []
//     for(let i=0; i <= cal1.length-1; i++){
//         if( cal1[i] === cal2[i] ){
//             comp.push('Iguales')
//         }
//         else{
//             comp.push('Diferentes')
//         }
//     }
//     return comp
// }

// let A = [5, 8, 4, 9, 5], B = [8, 7, 8, 6, 8], C = [7, 5, 10, 8, 3]

// function puntajePromedio(calificaciones){
//     let suma = 0
//     for(let i=0; i <= calificaciones.length-1; i++){
//         suma = calificaciones[i] + suma
//     }
//     return suma/calificaciones.length
// }

// function puntajeMayor(calificaciones){
//     let mayor = 0
//     for(let i=0; i <= calificaciones.length-1; i++){
//         if ( calificaciones[i] > mayor ) {
//             mayor = calificaciones[i]
//         }
//     }
//     return mayor
// }

// function competencia(A, B, C){

//     let promedios=[], mayores=[], ganadores=[0,0]
//     let promedioMayor=0, puntajeMax=0

//     promedios.push(puntajePromedio(A))
//     promedios.push(puntajePromedio(B))
//     promedios.push(puntajePromedio(C))

//     mayores.push(puntajeMayor(A)) 
//     mayores.push(puntajeMayor(B))
//     mayores.push(puntajeMayor(C))

//     for(let i = 0; i < promedios.length; i++){
        
//         if ( promedios[i]>promedioMayor ){
//             promedioMayor = promedios[i]
//             ganadores[0] = 'El ganador de promedios es el participante '+ (i+1)
//         }

//         if ( mayores[i]>puntajeMax ){
//             puntajeMax = mayores[i]
//             ganadores[1] = 'El ganador de puntajes es el participante '+ (i+1)
//         }

//     }
//     return ganadores
// }

// console.log(competencia(A, B, C))\

// tabla = [ ['Bob', 63, 0, 8, 0, 32, 0, 0], ['Alicia', 45, 0, 82, 0, 46, 0, 0] ]

// let bob = [50, 98, 32]
// let alicia = [45, 82, 46]

// function encontrarGanador(tabla){

//     let puntosA = 0, puntosB = 0

//     for(let i=0; i<=2; i++){

//         if( tabla[0][2*i+1] > tabla[1][2*i+1] ){
//             puntosA = puntosA + 1
//             tabla[0][2*i+2] = puntosA
//             tabla[1][2*i+2] = puntosB
//         }

//         else if( tabla[0][2*i+1] === tabla[1][2*i+1] ){
//             tabla[0][2*i+2] = puntosA
//             tabla[1][2*i+2] = puntosB
//         }

//         else{
//             puntosB = puntosB + 1
//             tabla[0][2*i+2] = puntosA
//             tabla[1][2*i+2] = puntosB
//         }
//     }

//     if(puntosA > puntosB){
//         tabla[0][ tabla[0].length-1 ] = 'Gano'
//         tabla[1][ tabla[1].length-1 ] = 'Perdio'
//     }
//     else{
//         tabla[0][ tabla[0].length-1 ] = 'Perdio'
//         tabla[1][ tabla[1].length-1 ] = 'Gano'
//     }

//     return tabla
// }

// function imprimirGanador(tabla){
//     tabla = encontrarGanador(tabla)

//     if (tabla[0][tabla[0].length-2] > tabla[1][tabla[1].length-2]){
//         return('El ganador es ' + tabla[0][0] + ' con ' + (tabla[0][tabla[1].length-2]) + ' puntos')
//     }
//     else{
//         return('El ganador es ' + tabla[1][0] + ' con ' + (tabla[1][tabla[1].length-2]) + ' puntos')
//     }
// }

// console.log(encontrarGanador(tabla))
// console.log(imprimirGanador(tabla))

//la lista de clientes.
// let arrayCuentas = [
//     {
//     nroCuenta: 5486273622,
//     tipoDeCuenta: "Cuenta Corriente",
//     saldoEnPesos: 27771,
//     titularCuenta: "Abigael Natte",
//     },
//     {
//     nroCuenta: 1183971869,
//     tipoDeCuenta: "Caja de Ahorro",
//     saldoEnPesos: 8675,
//     titularCuenta: "Ramon Connell",
//     },
//     {
//     nroCuenta: 9582019689,
//     tipoDeCuenta: "Caja de Ahorro",
//     saldoEnPesos: 27363,
//     titularCuenta: "Jarret Lafuente",
//     },
//     {
//     nroCuenta: 1761924656,
//     tipoDeCuenta: "Cuenta Corriente",
//     saldoEnPesos: 32415,
//     titularCuenta: "Ansel Ardley",
//     },
//     {
//     nroCuenta: 7401971607,
//     tipoDeCuenta: "Cuenta Unica",
//     saldoEnPesos: 18789,
//     titularCuenta: "Jacki Shurmer",
//     },
// ];

// const banco = {
//     clientes: arrayCuentas,
    
//     consultarCliente: function (titular) {
//     for (let i = 0; i < this.clientes.length; i++) {
//         if (titular === this.clientes[i].titularCuenta) {
//         return this.clientes[i];
//         }
//     }
//     },
//     deposito: function(titular, valorDepositar){
//         this.consultarCliente(titular).saldoEnPesos = this.consultarCliente(titular).saldoEnPesos + valorDepositar
//         return 'Depósito realizado, su nuevo saldo es: ', this.consultarCliente(titular).saldoEnPesos
//     },

//     extraccion: function(titular, valorExtraer){
//         if (this.consultarCliente(titular).saldoEnPesos - valorExtraer >= 0){
//             this.consultarCliente(titular).saldoEnPesos = this.consultarCliente(titular).saldoEnPesos - valorExtraer
//             return 'Extracción realizada correctamente, su nuevo saldo es: ', this.consultarCliente(titular).saldoEnPesos
//         }

//         else{
//             return 'Saldos insuficientes'
//         }
//     }
// };

// // console.log(banco.clientes);
// // let clienteEncontrado = banco.consultarCliente("lean"); // {}
// // console.log(clienteEncontrado);
// console.log(banco.deposito("Jacki Shurmer", 1000))
// console.log(banco.extraccion("Jacki Shurmer", 20000))
// console.log(arrayCuentas)

// forma clásica
// function sumar(a, b) {
//     return a + b;
// }
// console.log( sumar(2, 4) ); // 6

// ES6 arrow function
// let sumar = (a, b) => a + b;

// console.log( sumar(2, 4) ); // 6

// let numeros = [3,4,5,6,7]; 
// numeros.splice(0, 2, 2)
// console.log(numeros)

let centrimetros = pulgadas => pulgadas*2.54;

let url = string => `https://www.${string}.com`;

let admiracion = string => `${string}!`;

let edadPerro = edad => edad*7;

let horaTrabajo = sueldoMensual => sueldoMensual/40;

let IMC = (altura, peso) => peso/(altura**2);

let mayusculas = minusculas => minusculas.toUpperCase();

let tipoDato = dato => typeof(dato);

let circunferencia = radio => 2*Math.PI*radio;

const nombres = ['Martin','Homero','Cosme','Steven','Adam'];

function buscarNombre( arrayNombres, nombre, callBack = mostrarResultado ){
    for( let i = 0; i<arrayNombres.length; i++ ){
        if( nombres[i] === nombre ) {
            return callBack(nombre)
        }
    }
    return callBack('')
    }

function mostrarResultado(parametro) {
    if(!parametro){
        return `El nombre no fue encontrado`;
    }
    else {
        return `El nombre ${parametro} fue encontrado`;
    }
}

console.log(buscarNombre(nombres, 'homero', mostrarResultado));

