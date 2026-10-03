package ejemplos.seccion1_interfaces.s1_7_comparable_comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> curso = new ArrayList<>(List.of(
                new Estudiante("Valentina", 4.5),
                new Estudiante("Andrés", 3.8),
                new Estudiante("Sofía", 4.5),
                new Estudiante("Mateo", 4.1)));

        Collections.sort(curso); // usa compareTo
        System.out.println("Alfabético: " + curso);

        curso.sort(Comparator.comparingDouble(Estudiante::getPromedio)
                .reversed() // de mayor a menor
                .thenComparing(Estudiante::getNombre)); // desempate
        System.out.println("Por promedio: " + curso);
    }
}
