public class Main {

    public static void main(String[] args) {

        /**
         * Lo que conseguimos con el Factory es desacoplar la construcción del objeto, en lugar de estar utilizando el
         * constructor por todos lados, el unico lugar donde se utiliza el constructor es en el Factory y si el día de mañana
         * cambiamos el constructor, es decir sacamos o agregamos parametros en este, solo debemos modificar la factory
         * */

        CargaSimple tvLed = (CargaSimple) CargableFactory.getInstance().crearCargable(CargableFactory.CARGA_SIMPLE);
        tvLed.setNombre("TV LED");
        tvLed.setPeso(30);

        CargaSimple medicamento = (CargaSimple) CargableFactory.getInstance().crearCargable(CargableFactory.CARGA_SIMPLE);
        medicamento.setNombre("Medicamento");
        medicamento.setRefrigerado(true);
        medicamento.setPeso(2);

        Contenedor contenedor = (Contenedor) CargableFactory.getInstance().crearCargable(CargableFactory.CONTENEDOR);
        contenedor.setNombre("Evergreen");
        contenedor.setPeso(100);
        contenedor.agregar(tvLed);
        contenedor.agregar(medicamento);

        Barco barco = new Barco("POO");
        barco.agregar(tvLed);
        barco.agregar(medicamento);
        barco.agregar(contenedor);
        barco.generarInforme();
    }
}
