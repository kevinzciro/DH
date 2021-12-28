package piedraPapelTijera;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del primer jugador: ");
        String jugadorUno = scanner.nextLine();

        System.out.print("Ingrese el nombre del segundo jugador: ");
        String jugadorDos = scanner.nextLine();

        piedraPapelTijera(jugadorUno, jugadorDos);
    }

    public static void piedraPapelTijera(String jugadorUno,  String jugadorDos){
        Scanner scannerFuncion = new Scanner(System.in);

        int gandosJugadorUno = 0;
        int gandosJugadorDos = 0;

        while(true){

            System.out.printf("%s: Piedra, Papel o Tijera? ", jugadorUno);
            String jugadaJugadorUno = scannerFuncion.nextLine();

            if(jugadaJugadorUno.equals("*")){
                System.out.print("\n");
                break;
            }

            System.out.printf("%s: Piedra, Papel o Tijera? ", jugadorDos);
            String jugadaJugadoDos = scannerFuncion.nextLine();

            String ganador = cualGana(jugadaJugadorUno, jugadaJugadoDos);

            if ( ganador.equals("Jugador uno") ){
                gandosJugadorUno++;
            }
            else if ( ganador.equals("jugador dos") ){
                gandosJugadorDos++;
            }


        }

        if (gandosJugadorUno > gandosJugadorDos) {
            System.out.printf("El ganador del juego es %s", jugadorUno);
        }
        else if (gandosJugadorUno == gandosJugadorDos){
            System.out.print("Empate");
        }
        else{
            System.out.printf("El ganador del juego es %s", jugadorDos);
        }
    }

    public static String cualGana(String jugadaJugadorUno, String jugadaJugadorDos) {
        int puntajeJugadorUno = 0;
        int puntajeJugadorDos = 0;
        boolean ganaJugadorUno = (jugadaJugadorUno.equals("Piedra") && jugadaJugadorDos.equals("Tijera")) ||
                (jugadaJugadorUno.equals("Papel") && jugadaJugadorDos.equals("Piedra")) ||
                (jugadaJugadorUno.equals("Tijera") && jugadaJugadorDos.equals("Papel"));

        boolean empate = (jugadaJugadorUno.equals("Piedra") && jugadaJugadorDos.equals("Piedra")) ||
                (jugadaJugadorUno.equals("Papel") && jugadaJugadorDos.equals("Papel")) ||
                (jugadaJugadorUno.equals("Tijera") && jugadaJugadorDos.equals("Tijera"));

        if (ganaJugadorUno) {
            puntajeJugadorUno++;
            System.out.println("La ronda la gano el jugador uno\n");
        }
        else if (empate){
            puntajeJugadorUno++;
            puntajeJugadorDos++;
            System.out.println("Empate\n");
        }
        else{
            puntajeJugadorDos++;
            System.out.println("La ronda la gano el gano jugador dos\n");
        }

        if (puntajeJugadorUno > puntajeJugadorDos){
            return "Jugador uno";
        }
        else if( puntajeJugadorUno == puntajeJugadorDos){
            return "Empate";
        }
        else{
            return "Jugador dos";
        }

    }
}
