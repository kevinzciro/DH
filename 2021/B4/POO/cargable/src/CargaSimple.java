public class CargaSimple extends Cargable {

    private double peso;
    private boolean refrigerado;

    public CargaSimple() {
        this.refrigerado = false;
        this.peso = 0.0;
    }

    @Override
    public double calcularPeso() {
        double pesoFinal = this.peso;
        if (this.refrigerado) {
            pesoFinal += peso * 0.1;
        }
        return pesoFinal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }
}
