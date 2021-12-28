import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Cargable {

    private List<Cargable> cargables;
    private double peso;

    public Contenedor() {
        this.peso = 0.0;
        this.cargables = new ArrayList<Cargable>();
    }

    @Override
    public double calcularPeso() {
        double pesoFinal = this.peso;
        for (Cargable cargable : this.cargables) {
            pesoFinal += cargable.calcularPeso();
        }
        return pesoFinal;
    }

    public void agregar(Cargable cargable) {
        this.cargables.add(cargable);
    }

    public List<Cargable> getCargables() {
        return cargables;
    }

    public void setCargables(List<Cargable> cargables) {
        this.cargables = cargables;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
