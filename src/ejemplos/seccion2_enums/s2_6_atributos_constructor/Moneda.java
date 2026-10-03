package ejemplos.seccion2_enums.s2_6_atributos_constructor;

public enum Moneda {
    COP("Peso colombiano", "$", 1), // cada constante llama al constructor
    USD("Dólar estadounidense", "US$", 4_000),
    EUR("Euro", "€", 4_400),
    MXN("Peso mexicano", "MX$", 220); // punto y coma obligatorio

    private final String nombre; // atributos: final = inmutables
    private final String simbolo;
    private final double enPesos; // valor de 1 unidad en COP (tasas de ejemplo)

    Moneda(String nombre, String simbolo, double enPesos) { // implícitamente private
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.enPesos = enPesos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getEnPesos() {
        return enPesos;
    }

    public String formatear(double cantidad) {
        return simbolo + String.format("%,.2f", cantidad);
    }

    public double convertirA(Moneda destino, double cantidad) {
        return cantidad * this.enPesos / destino.enPesos;
    }

    // Búsqueda por un código propio (mejor que guardar el ordinal)
    public static Moneda desdeSimbolo(String simbolo) {
        for (Moneda m : values()) {
            if (m.simbolo.equals(simbolo)) return m;
        }
        throw new IllegalArgumentException("Símbolo desconocido: " + simbolo);
    }
}
