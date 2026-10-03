package ejemplos.seccion2_enums.s2_3_s2_4_metodos_enum;

public class Main {
    public static void main(String[] args) {
        // 1. values(): recorrer todas las constantes
        for (DiaSemana d : DiaSemana.values()) {
            System.out.print(d.ordinal() + ":" + d.name() + " ");
        }
        System.out.println();

        // 2. valueOf(): convertir texto (por ejemplo, lo que escribe el usuario)
        DiaSemana d = DiaSemana.valueOf("MARTES");
        System.out.println("valueOf(\"MARTES\") → " + d);

        // 3. compareTo(): según el orden en que se declararon
        boolean antes = DiaSemana.LUNES.compareTo(DiaSemana.JUEVES) < 0;
        System.out.println("¿LUNES va antes que JUEVES? " + antes);
        System.out.println("Cantidad de días: " + DiaSemana.values().length);

        // 4. valueOf() con un texto que no existe
        try {
            DiaSemana.valueOf("lunes"); // minúsculas: no coincide
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
