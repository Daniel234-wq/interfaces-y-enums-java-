package ejemplos.seccion1_interfaces.s1_6_funcionales_lambdas.util_function;

import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Declarar comportamientos como si fueran datos
        Predicate<String> esLarga = s -> s.length() > 5;
        Function<String, Integer> longitud = String::length; // referencia a método
        Consumer<String> imprimir = System.out::println;
        Supplier<String> saludo = () -> "¡Bienvenido al laboratorio!";
        UnaryOperator<String> gritar = s -> s.toUpperCase() + "!";
        BiFunction<Integer, Integer, Integer> mayor = Math::max;

        imprimir.accept(saludo.get());
        System.out.println("¿'interfaz' es larga? " + esLarga.test("interfaz"));
        System.out.println("Longitud de 'enum': " + longitud.apply("enum"));
        System.out.println("Mayor entre 17 y 42: " + mayor.apply(17, 42));

        // Los Predicate se combinan con and / or / negate
        Predicate<String> empiezaConJ = s -> s.startsWith("J");
        Predicate<String> largaYConJ = esLarga.and(empiezaConJ);

        List<String> palabras = List.of("Java", "JavaScript", "Kotlin", "JetBrains", "Go");
        palabras.stream().filter(largaYConJ).map(gritar).forEach(imprimir);
    }
}
