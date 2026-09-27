import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        try {

            // Crear bicicletas eléctricas
            BicicletaElectrica electrica1 =
                    new BicicletaElectrica(
                            "BIC-E01",
                            2023,
                            22.5,
                            60,
                            false
                    );

            BicicletaElectrica electrica2 =
                    new BicicletaElectrica(
                            "BIC-E02",
                            2022,
                            24.0,
                            45,
                            true
                    );

            // Crear bicicletas de montaña
            BicicletaMontanya montanya1 =
                    new BicicletaMontanya(
                            "BIC-M01",
                            2021,
                            13.5,
                            2
                    );

            BicicletaMontanya montanya2 =
                    new BicicletaMontanya(
                            "BIC-M02",
                            2020,
                            12.0,
                            1
                    );

            // Activar garantía extendida para BIC-E01
            electrica1.activarGarantiaExtendida();

            // Crear gestor
            GestorTallerBicicleta gestor =
                    new GestorTallerBicicleta();

            // Registrar bicicletas
            gestor.registrarBicicleta(electrica1);
            gestor.registrarBicicleta(electrica2);
            gestor.registrarBicicleta(montanya1);
            gestor.registrarBicicleta(montanya2);

            // Buscar por código
            System.out.println(
                    "\n--- BÚSQUEDA POR CÓDIGO ---");

            for (Bicicleta bicicleta :
                    gestor.buscarBicicletas("BIC-E01")) {

                System.out.println(bicicleta);
            }

            // Listar todas
            System.out.println(
                    "\n--- TODAS LAS BICICLETAS ---");

            for (Bicicleta bicicleta :
                    gestor.getBicicletas()) {

                System.out.println(bicicleta);

                System.out.println(
                        "Costo mantención: $"
                                + bicicleta.calcularCostoMantencion()
                );
            }

            // Mostrar garantía
            System.out.println(
                    "\n--- GARANTÍA EXTENDIDA ---");

            System.out.println(
                    "BIC-E01 tiene garantía: "
                            + electrica1.tieneGarantiaExtendida()
            );

        } catch (IllegalArgumentException ex) {

            System.out.println(
                    "Error: "
                            + ex.getMessage()
            );
        }
    }
}