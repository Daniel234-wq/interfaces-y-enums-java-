package ejemplos.seccion1_interfaces.s1_9_sealed_records;

import java.util.List;

public class Main {
    static double area(Figura f) {
        return switch (f) { // switch con patrones (Java 21)
            case Circulo c -> Math.PI * c.radio() * c.radio();
            case Rectangulo(double b, double h) -> b * h; // patrón de record
            case Triangulo t -> t.base() * t.altura() / 2;
        }; // sin default: el compilador sabe que no existen más casos
    }

    public static void main(String[] args) {
        List<Figura> figuras = List.of(
                new Circulo(5),
                new Rectangulo(4, 6),
                new Triangulo(10, 3));

        for (Figura f : figuras) {
            System.out.printf("%-34s área = %.2f%n", f, area(f));
        }
    }
}
