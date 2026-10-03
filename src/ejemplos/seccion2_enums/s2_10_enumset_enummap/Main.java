package ejemplos.seccion2_enums.s2_10_enumset_enummap;

import java.util.EnumMap;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<DiaSemana> finde = EnumSet.of(DiaSemana.SABADO, DiaSemana.DOMINGO);
        EnumSet<DiaSemana> laborales = EnumSet.complementOf(finde); // el resto
        EnumSet<DiaSemana> mitad = EnumSet.range(DiaSemana.MARTES, DiaSemana.JUEVES);

        System.out.println("Fin de semana: " + finde);
        System.out.println("Laborales:     " + laborales);
        System.out.println("Mitad:         " + mitad);
        System.out.println("¿VIERNES es laboral? " + laborales.contains(DiaSemana.VIERNES));

        // EnumMap: la clave es un enum. Se recorre en orden de declaración
        EnumMap<DiaSemana, String> horario = new EnumMap<>(DiaSemana.class);
        horario.put(DiaSemana.VIERNES, "Laboratorio de Java"); // insertado 1.º
        horario.put(DiaSemana.LUNES, "Teoría de interfaces");   // insertado 2.º
        horario.put(DiaSemana.MIERCOLES, "Taller de enums");    // insertado 3.º
        horario.forEach((dia, clase) -> System.out.printf("%-10s %s%n", dia, clase));
    }
}
