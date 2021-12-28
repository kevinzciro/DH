public class CargableFactory {

    private static CargableFactory instance;
    public static final String CARGA_SIMPLE = "CARGA_SIMPLE";
    public static final String CONTENEDOR = "CONTENEDOR";

    // Singleton: constructor privado
    private CargableFactory() {}

    // Singleton: devuelve una unica instancia
    public static CargableFactory getInstance() {
        if (instance == null) instance = new CargableFactory();
        return instance;
    }

    // Crea los objetos que necesite el Barco
    public Cargable crearCargable(String tipo) {
        switch (tipo) {
            case CARGA_SIMPLE:
                return new CargaSimple();
            case CONTENEDOR:
                return new Contenedor();
            default:
                return null;
        }
    }
}
