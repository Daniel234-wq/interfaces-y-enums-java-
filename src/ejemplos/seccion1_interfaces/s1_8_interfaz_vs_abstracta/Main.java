package ejemplos.seccion1_interfaces.s1_8_interfaz_vs_abstracta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> nomina = List.of(
                new Desarrollador("Laura", 6_000_000),
                new Practicante("Tomás", 1_750_000));

        nomina.forEach(e -> System.out.println(e.resumen()));

        double total = nomina.stream().mapToDouble(Empleado::salarioMensual).sum();
        System.out.printf("Total   $%,.0f%n", total);
    }
}
