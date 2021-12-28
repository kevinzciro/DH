import java.util.ArrayList;
import java.util.List;

public class Barco {

    private String nombre;
    private List<Cargable> cargables;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.cargables = new ArrayList<Cargable>();
    }

    public void generarInforme() {
        String informe = "Nombre del barco: "
                + this.getNombre() + "\n"
                + "********************* \n"
                + "Cargas: \n"
                + "********************* \n";
        for (Cargable cargable : cargables) {
            informe += "Nombre: " + cargable.getNombre() + "\n"
                + "Peso: " + cargable.calcularPeso() + " kg \n"
                + "_____________________\n";
        }
        System.out.println(informe);
    }

    public void agregar(Cargable cargable) {
        this.cargables.add(cargable);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cargable> getCargables() {
        return cargables;
    }

    public void setCargables(List<Cargable> cargables) {
        this.cargables = cargables;
    }
}
