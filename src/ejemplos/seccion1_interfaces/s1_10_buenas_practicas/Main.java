package ejemplos.seccion1_interfaces.s1_10_buenas_practicas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Programa contra la interfaz, no contra la implementación:
    // En lugar de ArrayList<String>, usa List<String>
    static void guardar(List<String> datos) {
        System.out.println("Guardando " + datos.size() + " elementos.");
    }

    public static void main(String[] args) {
        // Uso de programación contra la interfaz List
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        guardar(nombres);

        // Demostración de segregación de interfaces
        Imprimible simple = new ImpresoraBasica();
        simple.imprimir("Reporte_Mensual.pdf");

        Multifuncional multi = new Multifuncional();
        multi.imprimir("Factura.pdf");
        multi.escanear("Contrato_Firmado.pdf");
    }
}
