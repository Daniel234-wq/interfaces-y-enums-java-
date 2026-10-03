package ejemplos.seccion2_enums.s2_11_singleton;

public class Main {
    public static void main(String[] args) {
        Configuracion c1 = Configuracion.INSTANCIA;
        Configuracion c2 = Configuracion.INSTANCIA;

        c1.setIdioma("en");
        c1.setVolumen(140); // se limita a 100 con Math.clamp

        System.out.println("c2 ve: " + c2.getIdioma() + ", volumen " + c2.getVolumen());
        System.out.println("¿Mismo objeto? " + (c1 == c2));
    }
}
