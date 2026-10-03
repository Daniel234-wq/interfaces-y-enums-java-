package retos.reto3_calculadora_lambdas;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Reto 3: Calculadora con Lambdas en Enum ===");
        double a = 10, b = 3;

        for (Operador op : Operador.values()) {
            System.out.printf("%.1f %s %.1f = %.4f%n",
                    a, op.getSimbolo(), b, op.aplicar(a, b));
        }

        // Comparativa de legibilidad solicitada por el reto:
        // La versión con lambdas y DoubleBinaryOperator es significativamente más concisa y legible
        // para operaciones matemáticas simples y directas (1 línea), eliminando el boilerplate de
        // declarar métodos abstractos y sobrescribirlos en cuerpos de constantes anónimas.
        // Sin embargo, si alguna operación requiriera lógica compleja de múltiples pasos,
        // validaciones extensas o estado adicional, el método abstracto por constante (§2.7)
        // sigue siendo la mejor opción para no sobrecargar el constructor del enum.
    }
}
