package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.static_private;

public interface Formateador {
    String formatear(String texto); // abstracto

    default String conMarco(String texto) { // default
        String contenido = "| " + formatear(texto) + " |";
        String borde = linea(contenido.length());
        return borde + "\n" + contenido + "\n" + borde;
    }

    static String limpiar(String texto) { // static: utilidad
        return texto.trim().replaceAll("\\s+", " ");
    }

    private String linea(int largo) { // private: ayudante
        return "+" + "-".repeat(largo - 2) + "+";
    }
}
