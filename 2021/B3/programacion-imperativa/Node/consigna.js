/*let edad=21 //(el número es a modo de ejemplo, podés cambiarlo o crear otras para tener varias pruebas)

if (edad%2===1){
    console.log('¿Sabías que tu edad es impar?')
    if(edad<=0){
        console.log("Error, edad inválida. Por favor ingrese un número válido.")
    }
    else if(edad<18) {
        console.log("No puede pasar al bar.")
    }
    else if(edad<21){
        console.log("Puede pasar al bar, pero no puede tomar alcohol.")
    }
    else if(edad === 21){
        console.log('Bienvenido. Felicidades sos mayor de edad')
    }
    else{
        console.log("Puede pasar al bar y tomar alcohol.")
    }
}
*/

/*function totalAPagar(vehiculo, litrosConsumidos){
    
    let precioLitro, totalPagar = 0

    if (vehiculo=='coche'){
        precioLitro=86
    }
    else if(vehiculo=='moto'){
        precioLitro=70
    }
    else if(vehiculo=='autobus'){
        precioLitro=55
    }

    if (litrosConsumidos>0 && litrosConsumidos<=25){
        totalPagar = totalPagar + 50
    }
    else{
        totalPagar = totalpagar + 25
    }

    totalPagar = totalPagar + (litrosConsumidos*precioLitro)

    return(totalPagar)
}

console.log(totalAPagar('autobus', 2))
*/

/*
function local(tipoSandwich, tipoPan, queso, tomate, lechuga, cebolla, mayonesa, mostaza){

    let totalPagar = 0

    if (tipoSandwich==='pollo'){
        totalPagar = totalPagar + 150
    }
    else if (tipoSandwich==='carne'){
        totalPagar = totalPagar + 200
    }
    else if (tipoSandwich==='veggie'){
        totalPagar = totalPagar + 100
    }

    if (tipoPan==='blanco'){
        totalPagar = totalPagar + 50
    }
    else if (tipoPan==='negro'){
        totalPagar = totalPagar + 60
    }
    else if (tipoPan==='s/gluten'){
        totalPagar = totalPagar + 75
    }

    if (queso){
        totalPagar = totalPagar + 20
    }
    if (tomate){
        totalPagar = totalPagar + 15
    }
    if (lechuga){
        totalPagar = totalPagar + 10
    }
    if (cebolla){
        totalPagar = totalPagar + 15
    }
    if (mayonesa){
        totalPagar = totalPagar + 5
    }
    if (mostaza){
        totalPagar = totalPagar + 5
    }

    return(totalPagar)
}

console.log(local('carne', 'blanco', 1,1,1,1,1,1))

*/

/*
function secreto(numero){
    if(numero === Math.round(10*Math.random())){

        return('Felicidades')
    }
    else{
        return('Sigue intentandolo')
    }

}

console.log(secreto(6))
*/
