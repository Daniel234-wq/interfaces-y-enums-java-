package ejemplos.seccion1_interfaces.s1_4_polimorfismo.granja;

import java.util.List;

public class GranjaMain {
    public static void main(String[] args) {
        List<Sonoro> granja = List.of(new Perro(), new Gato(), new Vaca());

        for (Sonoro animal : granja) {
            String nombre = animal.getClass().getSimpleName();
            System.out.println(nombre + " dice " + animal.hacerSonido());
        }

        // Demostración de pattern matching con instanceof (Java 16+)
        Sonoro animal = new Perro();
        if (animal instanceof Perro p) {
            p.traerPelota();
        }
    }
}
