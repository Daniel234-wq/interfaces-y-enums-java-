package ejemplos.seccion1_interfaces.s1_3_anatomia_reglas;

public interface ReglasJuego {
    // public static final implícito
    int VIDAS_INICIALES = 3;
    int PUNTOS_POR_MONEDA = 10;

    // public abstract implícito
    int calcularPuntaje(int monedas);
}
