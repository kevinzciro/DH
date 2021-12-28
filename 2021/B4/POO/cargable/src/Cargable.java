public abstract class Cargable {

    private String nombre;

    public abstract double calcularPeso();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
