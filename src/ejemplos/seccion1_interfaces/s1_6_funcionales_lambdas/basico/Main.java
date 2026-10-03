package ejemplos.seccion1_interfaces.s1_6_funcionales_lambdas.basico;

public class Main {
    public static void main(String[] args) {
        // Forma 1: clase anónima (antes de Java 8). Mucho "ruido".
        Operacion suma = new Operacion() {
            @Override
            public int aplicar(int a, int b) {
                return a + b;
            }
        };

        // Forma 2: lambda de una expresión. Mismo significado.
        Operacion resta = (a, b) -> a - b;

        // Forma 3: lambda con bloque { } cuando necesitas varias líneas
        Operacion potencia = (base, exponente) -> {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) resultado *= base;
            return resultado; // con llaves, return es obligatorio
        };

        System.out.println("8 + 2 = " + suma.aplicar(8, 2));
        System.out.println("8 - 2 = " + resta.aplicar(8, 2));
        System.out.println("2 ^ 10 = " + potencia.aplicar(2, 10));
        System.out.println("6 x 7 = " + calcular(6, 7, (x, y) -> x * y));
    }

    // Un método que recibe COMPORTAMIENTO como parámetro
    static int calcular(int a, int b, Operacion op) {
        return op.aplicar(a, b);
    }
}
