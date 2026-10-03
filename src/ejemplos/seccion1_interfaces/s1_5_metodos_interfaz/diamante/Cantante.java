package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.diamante;

public interface Cantante {
    default String presentarse() {
        return "canto";
    }
}
