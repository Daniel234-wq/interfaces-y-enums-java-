package ejemplos.seccion2_enums.s2_8_enums_interfaces;

public class Main {
    static void cobrar(String concepto, double base, Calculable regla) {
        System.out.printf("%-12s base $%,9.0f recargo $%,7.0f%n",
                concepto, base, regla.calcular(base));
    }

    public static void main(String[] args) {
        cobrar("Audífonos", 200_000, Impuesto.IVA_GENERAL); // un enum…
        cobrar("Producto B", 40_000, Impuesto.IVA_REDUCIDO);
        cobrar("Libro", 60_000, Impuesto.EXENTO);
        cobrar("Propina", 80_000, base -> base * 0.10); // …o una lambda
    }
}
