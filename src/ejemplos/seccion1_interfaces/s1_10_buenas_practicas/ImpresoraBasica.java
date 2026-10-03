package ejemplos.seccion1_interfaces.s1_10_buenas_practicas;

public class ImpresoraBasica implements Imprimible {
    @Override
    public void imprimir(String doc) {
        System.out.println("Imprimiendo: " + doc);
    }
}
