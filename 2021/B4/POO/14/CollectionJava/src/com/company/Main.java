package com.company;

public class Main {

    public static void main(String[] args) {

        // crear los objetos
        Equipo barcelona = new Equipo("barcelona");


        Jugador messi = new Jugador(10,"Messi",false,true);
        Jugador messi2 = new Jugador(8,"Messi2",false,true);
        Jugador messi3 = new Jugador(11,"Messi3",false,true);
        Jugador messi4 = new Jugador(7,"Messi4",false,true);


        barcelona.addJugador(messi);
        barcelona.addJugador(messi2);
        barcelona.addJugador(messi3);

        // mostrarlos

        barcelona.mostrarJugadoresTitulares();

        System.out.println( "lesionados:" + barcelona.getCantidadTitularesLesionados());



    }
}
