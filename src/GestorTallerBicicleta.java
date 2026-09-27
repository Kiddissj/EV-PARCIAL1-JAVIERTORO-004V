import java.util.ArrayList;

public class GestorTallerBicicleta {

    private ArrayList<Bicicleta> bicicletas;

    public GestorTallerBicicleta() {
        bicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta) {

        bicicletas.add(bicicleta);

        System.out.println(
                bicicleta.getCodigoBicicleta()
                        + " incorporada correctamente.");
    }

    // Sobrecarga
    public void registrarBicicleta(
            Bicicleta bicicleta,
            boolean mostrarMensaje) {

        bicicletas.add(bicicleta);

        if (mostrarMensaje) {

            System.out.println(
                    bicicleta.getCodigoBicicleta()
                            + " incorporada correctamente.");
        }
    }

    public ArrayList<Bicicleta> buscarBicicletas(
            String codigo) {

        ArrayList<Bicicleta> resultado =
                new ArrayList<>();

        for (Bicicleta bici : bicicletas) {

            if (bici.getCodigoBicicleta()
                    .equalsIgnoreCase(codigo)) {

                resultado.add(bici);
            }
        }

        return resultado;
    }

    // Sobrecarga
    public ArrayList<Bicicleta> buscarBicicletas() {
        return bicicletas;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }
}
