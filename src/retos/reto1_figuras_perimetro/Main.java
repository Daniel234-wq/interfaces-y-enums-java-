package retos.reto1_figuras_perimetro;

import java.util.List;

public class Main {
    // Cálculo exhaustivo de área con patrones de record (Java 21+)
    static double area(Figura f) {
        return switch (f) {
            case Circulo c -> Math.PI * c.radio() * c.radio();
            case Rectangulo(double b, double h) -> b * h;
            case Triangulo t -> t.base() * t.altura() / 2.0;
            case Cuadrado(double lado) -> lado * lado;
        };
    }

    // Cálculo exhaustivo de perímetro con patrones de record (Java 21+)
    static double perimetro(Figura f) {
        return switch (f) {
            case Circulo c -> 2 * Math.PI * c.radio();
            case Rectangulo(double b, double h) -> 2 * (b + h);
            case Triangulo(double b, double h) -> {
                // Considerando triángulo isósceles con base b y altura h
                double ladoIgual = Math.hypot(b / 2.0, h);
                yield b + (2 * ladoIgual);
            }
            case Cuadrado(double lado) -> 4 * lado;
        };
    }

    public static void main(String[] args) {
        List<Figura> figuras = List.of(
                new Circulo(5),
                new Rectangulo(4, 6),
                new Triangulo(10, 3),
                new Cuadrado(4)
        );

        System.out.println("=== Reto 1: Figuras con Área y Perímetro ===");
        for (Figura f : figuras) {
            System.out.printf("%-35s | Área: %6.2f | Perímetro: %6.2f%n",
                    f, area(f), perimetro(f));
        }
    }
}
