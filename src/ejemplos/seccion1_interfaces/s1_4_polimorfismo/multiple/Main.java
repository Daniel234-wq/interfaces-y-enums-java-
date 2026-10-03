package ejemplos.seccion1_interfaces.s1_4_polimorfismo.multiple;

public class Main {
    // Este método acepta CUALQUIER cosa que sepa volar
    static void despegar(Volador v) {
        v.volar();
    }

    public static void main(String[] args) {
        Pato lucas = new Pato();
        lucas.nadar();
        despegar(lucas);           // un Pato ES un Volador
        despegar(new Avion());      // un Avion también
    }
}
