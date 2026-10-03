package retos.reto4_promociones_combinables;

@FunctionalInterface
public interface Promocion {
    double descuento(double subtotal);

    // Método default solicitado en el Reto 4: combina dos promociones sin superar el subtotal
    default Promocion y(Promocion otra) {
        return subtotal -> {
            double desc1 = this.descuento(subtotal);
            double desc2 = otra.descuento(subtotal);
            return Math.min(subtotal, desc1 + desc2);
        };
    }

    static Promocion ninguna() {
        return subtotal -> 0;
    }

    static Promocion porcentaje(double pct) {
        return subtotal -> subtotal * pct / 100.0;
    }

    static Promocion fijaDesde(double minimo, double valor) {
        return subtotal -> subtotal >= minimo ? valor : 0;
    }
}
