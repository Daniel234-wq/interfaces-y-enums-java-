package ejemplos.seccion1_interfaces.s1_3_anatomia_reglas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vidas: " + ReglasJuego.VIDAS_INICIALES);
        ReglasJuego juego = new JuegoArcade();
        System.out.println("Puntaje con 7 monedas: " + juego.calcularPuntaje(7));
        // ReglasJuego.VIDAS_INICIALES = 5; // ERROR de compilación: no se puede asignar a una variable final
    }
}
