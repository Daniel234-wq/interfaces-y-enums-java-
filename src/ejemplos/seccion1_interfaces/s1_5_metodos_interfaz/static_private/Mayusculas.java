package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.static_private;

public class Mayusculas implements Formateador {
    @Override
    public String formatear(String texto) {
        return texto.toUpperCase();
    }
}
