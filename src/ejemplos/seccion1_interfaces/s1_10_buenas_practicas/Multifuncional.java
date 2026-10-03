package ejemplos.seccion1_interfaces.s1_10_buenas_practicas;

public class Multifuncional implements Imprimible, Escaneable {
    @Override
    public void imprimir(String doc) {
        System.out.println("Multifuncional imprimiendo: " + doc);
    }

    @Override
    public void escanear(String doc) {
        System.out.println("Multifuncional escaneando: " + doc);
    }
}
