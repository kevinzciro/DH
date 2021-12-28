package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;

    //private List jugadores;
    private List<Jugador> jugadores;
    private List<Integer> numeros;

    public Equipo(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.numeros = new ArrayList<>();
    }
    public void addJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Integer getCantidadTitularesLesionados(){
        Integer lesionados = 0;

        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getTitular() && jugadores.get(i).getLesionado()){
                lesionados ++;
           }
        }
        return lesionados;
    }

    public Integer getCantidadLesionadosForEach(){
        Integer lesionados = 0;

        for (Jugador jugador : jugadores) {
            if(jugador.getTitular()&& jugador.getLesionado()){
                lesionados++;
            }
        }
       return  lesionados;
    }

    public void mostrarJugadoresTitulares(){
        jugadores.sort(null);

        for (Jugador jugador : jugadores) {
            if(jugador.getTitular()) {
                System.out.println(jugador);
            }
        }

    }


}
