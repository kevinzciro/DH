function sumar(x,y){
    // Retorna la suma de los numero x e y 
    return(x+y)
}

function restar(x,y){
    // Retorna la diferencia entre x e y
    return(x-y)
}

function multiplicar(x,y){
    // Retorna la multiplicacion de x e y
    return(x*y)
}

function dividir(x,y){
    // Retornar la division entre x entre y
    return(x/y)
}

function cuadradoDeUnNumero(x){
    // retorna el cuadrado de x
    return(multiplicar(x,x))
}

function promedioDeTresNumeros(x,y,z){
    // Retorna el promedio de los numeros x,y,z
    return( dividir(sumar(sumar(x,y),z),3) )
}

function calcularPorcentaje(total,porcentaje){
    // Retorna el resultado de un porcentaje dado el total 
    // ejemplo: si se le pasa 300 y 15 retorna 45 que es el 15% de 300
    return( dividir(multiplicar(total, porcentaje),100) )
}

function generadorDePorcentaje(deseado=1, total){
    // Retorna el porcentaje deseado con respecto a un total
    // Ejemplo: Si se le pasa 2, 200 retorna 1 ya que 2 es el 1% de 200
    return( dividir(multiplicar(deseado, 100),total) )
}

console.log('-------------- Testeo de Operaciones / Calculadora --------------')

console.log('La suma es:', sumar(1,2))

console.log('La resta es:', restar(2,3))

console.log('La multiplicacion es: ', multiplicar(6,7))

console.log('La division es: ', dividir(1,0))

console.log(calcularPorcentaje(300,15))

console.log(generadorDePorcentaje(2,200))