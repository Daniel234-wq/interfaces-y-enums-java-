package ejemplos.seccion1_interfaces.s1_4_polimorfismo.multiple;

public class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("Avión: despego a 900 km/h");
    }
}
