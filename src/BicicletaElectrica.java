public class BicicletaElectrica extends Bicicleta
        implements ConGarantiaExtendida {

    private int autonomiaKm;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public BicicletaElectrica(String codigoBicicleta,
                              int anioFabricacion,
                              double peso,
                              int autonomiaKm,
                              boolean bateriaCertificada) {

        super(codigoBicicleta,
                anioFabricacion,
                peso);

        setAutonomiaKm(autonomiaKm);
        setBateriaCertificada(bateriaCertificada);

        garantiaExtendida = false;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(int autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public double calcularCostoMantencion() {

        double costo = 45000;

        if (!bateriaCertificada) {
            costo *= 1.25;
        }

        return costo;
    }

    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaExtendida;
    }

    @Override
    public void activarGarantiaExtendida() {
        garantiaExtendida = true;
    }
}