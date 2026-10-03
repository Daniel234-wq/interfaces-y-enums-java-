package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.static_private;

public class Main {
    public static void main(String[] args) {
        String entrada = Formateador.limpiar("  hola   mundo    java  ");
        Formateador f = new Mayusculas();
        System.out.println(f.conMarco(entrada));
        // f.linea(5); // ERROR: linea() es privado de la interfaz
        // f.limpiar("x"); // ERROR: los static se llaman con Formateador.limpiar
    }
}
