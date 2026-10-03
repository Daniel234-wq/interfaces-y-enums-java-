package retos.reto3_calculadora_lambdas;

import java.util.function.DoubleBinaryOperator;

public enum Operador {
    SUMA("+", (a, b) -> a + b),
    RESTA("-", (a, b) -> a - b),
    MULTIPLICACION("×", (a, b) -> a * b),
    DIVISION("÷", (a, b) -> {
        if (b == 0) throw new ArithmeticException("división por cero");
        return a / b;
    }),
    POTENCIA("^", Math::pow),
    MODULO("%", (a, b) -> {
        if (b == 0) throw new ArithmeticException("módulo por cero");
        return a % b;
    });

    private final String simbolo;
    private final DoubleBinaryOperator operacion;

    Operador(String simbolo, DoubleBinaryOperator operacion) {
        this.simbolo = simbolo;
        this.operacion = operacion;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double aplicar(double a, double b) {
        return operacion.applyAsDouble(a, b);
    }
}
