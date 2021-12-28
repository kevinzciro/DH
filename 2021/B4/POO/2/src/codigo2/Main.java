package codigo2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String texto1 = "hola";
//        String texto2 = "adios";
//        String resultado = texto1.equals(texto2) ? "Son iguales" : "Son diferentes";
//        System.out.println(resultado);


//        Integer numero1 = 4;
//        Integer numero2 = 4;
//        int resultado = numero1.compareTo(numero2);
//        if (resultado > 0){
//            System.out.printf("%d es mayor que %d\n", numero1, numero2);
//        }
//        else if (resultado == 0){
//            System.out.println("Son iguales");
//        }
//        else{
//            System.out.printf("%d es menor que %d\n", numero1, numero2);
//        }


        Scanner entrada = new Scanner(System.in);

//        System.out.print("Ingrese un numero: ");
//        int numero = entrada.nextInt();

//        System.out.print("Ingrese su nombre: ");
//        String nombre = entrada.nextLine();
//        System.out.print("Ingrese su apellido: ");
//        String apellido = entrada.nextLine();
//
//        String iniciales = Character.toString(nombre.charAt(0)) + Character.toString(apellido.charAt(0));
//
//        System.out.println(iniciales);

        System.out.print("Ingrese un numero: ");
        double num1 = entrada.nextDouble();
        System.out.print("Ingrese otro numero: ");
        double num2 = entrada.nextDouble();

        String mensaje = divisibilidad(num1, num2) ? "es divisible por" : "no es divisible por";

        System.out.printf("%.2f %s %.2f\n", num1, mensaje, num2);
    }

    private static boolean divisibilidad(double num1, double num2) {
        return num1 % num2 == 0;
    }

}


