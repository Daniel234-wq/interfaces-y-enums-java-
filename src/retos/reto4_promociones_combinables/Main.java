package retos.reto4_promociones_combinables;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Reto 4: Promociones Combinables ===");

        // Combinación: 10% de descuento + $1.000 fijo si supera $20.000
        Promocion combo = Promocion.porcentaje(10)
                .y(Promocion.fijaDesde(20_000, 1_000));

        double[] subtotales = { 30_000, 20_000, 15_000 };

        for (double subtotal : subtotales) {
            double desc = combo.descuento(subtotal);
            double total = subtotal - desc;
            System.out.printf("Subtotal: $%,10.0f | Descuento aplicado: $%,7.0f | Total: $%,10.0f%n",
                    subtotal, desc, total);
        }
    }
}
