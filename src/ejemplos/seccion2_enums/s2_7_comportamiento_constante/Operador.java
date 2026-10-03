package ejemplos.seccion2_enums.s2_7_comportamiento_constante;

public enum Operador {
    SUMA("+") {
        @Override
        public double aplicar(double a, double b) {
            return a + b;
        }
    },
    RESTA("-") {
        @Override
        public double aplicar(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACION("×") {
        @Override
        public double aplicar(double a, double b) {
            return a * b;
        }
    },
    DIVISION("÷") {
        @Override
        public double aplicar(double a, double b) {
            if (b == 0) throw new ArithmeticException("división por cero");
            return a / b;
        }
    };

    private final String simbolo;

    Operador(String simbolo) {
        this.simbolo = simbolo;
    }

    public String simbolo() {
        return simbolo;
    }

    // Cada constante está OBLIGADA a implementarlo
    public abstract double aplicar(double a, double b);
}
