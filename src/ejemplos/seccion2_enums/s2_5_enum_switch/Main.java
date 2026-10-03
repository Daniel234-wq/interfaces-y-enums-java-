package ejemplos.seccion2_enums.s2_5_enum_switch;

public class Main {
    static String tipoDia(DiaSemana dia) {
        return switch (dia) {
            case SABADO, DOMINGO -> "fin de semana";
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> "día laboral";
        };
    }

    static int horasDeClase(DiaSemana dia) {
        return switch (dia) {
            case LUNES, MIERCOLES -> 4;
            case MARTES, JUEVES -> 6;
            case VIERNES -> { // bloque cuando necesitas varias líneas
                int teoria = 1, laboratorio = 2;
                yield teoria + laboratorio; // yield "devuelve" el valor del bloque
            }
            case SABADO, DOMINGO -> 0;
        };
    }

    public static void main(String[] args) {
        for (DiaSemana d : DiaSemana.values()) {
            System.out.printf("%-10s %-14s %d h%n", d, tipoDia(d), horasDeClase(d));
        }
    }
}
