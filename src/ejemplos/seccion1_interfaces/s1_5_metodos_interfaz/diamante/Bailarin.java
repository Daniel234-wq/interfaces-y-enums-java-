package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.diamante;

public interface Bailarin {
    default String presentarse() {
        return "bailo";
    }
}
