package ejemplos.seccion1_interfaces.s1_4_polimorfismo.granja;

public class Gato implements Sonoro {
    @Override
    public String hacerSonido() {
        return "¡Miau!";
    }
}
