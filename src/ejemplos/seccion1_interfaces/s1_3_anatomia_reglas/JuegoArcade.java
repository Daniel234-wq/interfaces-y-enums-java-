package ejemplos.seccion1_interfaces.s1_3_anatomia_reglas;

public class JuegoArcade implements ReglasJuego {
    @Override
    public int calcularPuntaje(int monedas) {
        // La clase hereda la constante PUNTOS_POR_MONEDA
        return monedas * PUNTOS_POR_MONEDA;
    }
}
