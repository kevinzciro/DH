package com.company;

public class Cliente {

        //NO TOCAR CODIGO
        private String nombre;
        private String apellido;




    //NO TOCAR ESTE CODIGO
        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public Cliente(String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String setNombre(String nuevoNombre){
            return this.nombre = nuevoNombre;
        }

        public String setApellido(String nuevoApellido){
            return this.apellido = nuevoApellido;
        }



}
