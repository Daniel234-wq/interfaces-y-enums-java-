package ejemplos.seccion1_interfaces.s1_4_polimorfismo.multiple;

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("Pato: aleteo sobre el lago");
    }

    @Override
    public void nadar() {
        System.out.println("Pato: remo con mis patas");
    }
}
