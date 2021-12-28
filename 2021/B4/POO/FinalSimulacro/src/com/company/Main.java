package com.company;

import java.util.Scanner;

public class Main {

      public static void main(String[] args) {

          /*Lo que conseguimos con el Factory es desacoplar la construcción del objeto, en lugar de estar utilizando el
           * constructor por todos lados, el unico lugar donde se utiliza el constructor es en el Factory y si el día de mañana
           * cambiamos el constructor, es decir sacamos o agregamos parametros en este, solo debemos modificar la factory*/

          OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstancia().crearOfertaAcademica(OfertaAcademicaFactory.CURSO);

          cargarDatosCurso(frontEnd);

          OfertaAcademica backEnd = OfertaAcademicaFactory.getInstancia().crearOfertaAcademica(OfertaAcademicaFactory.CURSO);
          cargarDatosCurso(backEnd);

          OfertaAcademica programa = OfertaAcademicaFactory.getInstancia().crearOfertaAcademica(OfertaAcademicaFactory.PROGRAMA_INTENSIVO);
          cargarProgramaIntensivo(programa);

          agregarOferta(programa, frontEnd);
          agregarOferta(programa, frontEnd);

          OfertaAcademica carrera = OfertaAcademicaFactory.getInstancia().crearOfertaAcademica(OfertaAcademicaFactory.CARRERA);
          cargarCarrera(carrera);

          agregarOferta(carrera, backEnd);
          agregarOferta(carrera, frontEnd);

          Instituto digitalHouse = new Instituto("Digital House");
          digitalHouse.agregar(backEnd);
          digitalHouse.agregar(frontEnd);
          digitalHouse.agregar(programa);
          digitalHouse.agregar(carrera);

          digitalHouse.generarInforme();

      }

    // forma estatica : con esta forma todos los objetos son iguales.
    public static void cargarDatosCursoTest(OfertaAcademica oferta){
        Curso curso = null;

        if(oferta instanceof Curso)
            curso = (Curso) oferta;

        curso.setCargaHoraria(10.0);
        curso.setDuracion(20.0);
        curso.setValorHora(100.0);
    }

    public static void cargarDatosCurso(OfertaAcademica oferta){
            Scanner scanner = new Scanner(System.in);
            Curso curso = null;

            System.out.println("Ingrese el nombre del curso: ");
            oferta.setNombre(scanner.nextLine());

            if(oferta instanceof Curso)
                curso = (Curso) oferta;

            System.out.println("Ingrese la carga horaria: ");
            curso.setCargaHoraria(scanner.nextDouble());

            System.out.println("Ingrese la duracion: ");
            curso.setDuracion(scanner.nextDouble());

            System.out.println("Ingrese el valor hora: ");
            curso.setValorHora(scanner.nextDouble());
        }

        public static void cargarProgramaIntensivo(OfertaAcademica oferta){
            Scanner scanner = new Scanner(System.in);
            ProgramaIntensivo programa = null;

            System.out.println("Ingrese el nombre del programa: ");
            oferta.setNombre(scanner.nextLine());

            if(oferta instanceof ProgramaIntensivo)
                programa = (ProgramaIntensivo) oferta;

            System.out.println("Ingrese el porcentaje de bonificacion: ");
            programa.setPorcentajeBonifiacion(scanner.nextDouble());
        }

        public static void cargarCarrera(OfertaAcademica oferta){
            Scanner scanner = new Scanner(System.in);
            Carrera carrera = null;

            System.out.println("Ingrese el nombre de la carrera: ");
            oferta.setNombre(scanner.nextLine());

            if(oferta instanceof Carrera)
                carrera = (Carrera) oferta;

            System.out.println("Ingrese el precio base: ");
            carrera.setPrecioBase(scanner.nextDouble());
        }

        public static void agregarOferta(OfertaAcademica ofertaContenedora, OfertaAcademica oferta)
        {
            if(ofertaContenedora instanceof ProgramaIntensivo)
                ((ProgramaIntensivo)ofertaContenedora).agregar(oferta);

            if(ofertaContenedora instanceof Carrera) {
                try {
                    ((Carrera)ofertaContenedora).agregar(oferta);
                } catch (Exception e) {
                    System.out.println(e.getMessage() + oferta.getNombre());
                }
            }


        }

    }