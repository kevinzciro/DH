package Sinc;

// Para crear una clase
class Mascota{
//    Atributos
    public String nombre;
    public double edad;
    public double cantidadComida;
    public String respuesta;

//    Constructor de clase
    Mascota(String nombre, double edad, double cantidadComida, String respuesta)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadComida = cantidadComida;
        this.respuesta = respuesta;
    }
}

public class Programa {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        double numero1 = 2.0;
        double numero2 = 3.0;

        double resto = numero1 % numero2;

        if(resto == 0.0){
            System.out.println(numero1 + " es divisible por " + numero2);
        }
        else{
            System.out.println(numero1 + " no es divisible por " + numero2);
        }

//        Declarando un arreglo bidimensional
        String[][] arrayMascotas = new String[][]{
                {"Nombre : Manchitas", "Edad : 2 años", "Come : 1 kilo y medio", "Respuesta : guau guau"},
                {"Nombre : Nemo", "Edad : 1 año", "Come : 140 gramos", "Respuesta : blop blop"},
                {"Nombre : Silvestre", "Edad : 3 años", "Come : medio kilo", "Respuesta : miau"},
                {"Nombre : Manuelita", "Edad : 12 años", "Come : 300 gramos", "Respuesta : mar"},
                {"Nombre : Gardel", "Edad : 1 año", "Come : 350 gramos", "Respuesta : cucu"}
        };

//        Accediendo a cada elemento dentro del arreglo bidimensional requiere dos ciclos
        for (String[] arrayMascota : arrayMascotas) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrayMascota[j] + ". ");
            }
            System.out.print("\n");
        }

//        Declarar arreglo de mascotas con 5 elementos
        Mascota[] arr;
        arr = new Mascota[5];

        // Definicion de cada elemento
        arr[0] = new Mascota("Manchitas", 2, 1.5, "guau guau");
        arr[1] = new Mascota("Nemo", 1, 0.14, "blop blop");
        arr[2] = new Mascota("Silvestre", 3, 0.5, "miau");
        arr[3] = new Mascota("Manuelita", 12, 0.3, "mar");
        arr[4] = new Mascota("Gardel", 1, 0.35, "cucu");

        // accediendo a los elementos del array
        for (Mascota mascota : arr) {
            System.out.println(
                    "Nombre: " + mascota.nombre + ", Edad: " + mascota.edad + " Años" + ", Come: "
                            + mascota.cantidadComida + " Kg" + ", Respuesta: " + mascota.respuesta + '.'
            );
        }



    }
}
