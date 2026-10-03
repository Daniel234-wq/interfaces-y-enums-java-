package ejemplos.seccion2_enums.s2_1_s2_2_primer_enum;

public class Main {
    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.VIERNES;
        System.out.println("Hoy es " + hoy); // toString() devuelve el nombre

        if (hoy == DiaSemana.VIERNES) { // == es correcto con enums
            System.out.println("¡Por fin viernes!");
        }
    }
}
