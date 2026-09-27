public class BicicletaMontanya extends Bicicleta {

    private int cantidadSuspensiones;

    public BicicletaMontanya(String codigoBicicleta,
                             int anioFabricacion,
                             double peso,
                             int cantidadSuspensiones) {

        super(codigoBicicleta,
                anioFabricacion,
                peso);

        setCantidadSuspensiones(
                cantidadSuspensiones);
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(
            int cantidadSuspensiones) {

        this.cantidadSuspensiones =
                cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {

        double costo = 30000;

        if (cantidadSuspensiones > 1) {
            costo *= 1.15;
        }

        return costo;
    }
}