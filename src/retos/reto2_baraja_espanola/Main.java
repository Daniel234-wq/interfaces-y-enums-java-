package retos.reto2_baraja_espanola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carta> baraja = new ArrayList<>();

        // Generación de la baraja completa de 48 cartas con dos ciclos for sobre values()
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                baraja.add(new Carta(valor, palo));
            }
        }

        System.out.println("=== Reto 2: Baraja Española ===");
        System.out.println("Total de cartas generadas: " + baraja.size());
        System.out.println("\nPrimeras 5 cartas ordenadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(" - " + baraja.get(i));
        }

        // Barajar con Collections.shuffle
        Collections.shuffle(baraja);

        System.out.println("\nPrimeras 5 cartas después de barajar:");
        for (int i = 0; i < 5; i++) {
            System.out.println(" - " + baraja.get(i));
        }
    }
}
