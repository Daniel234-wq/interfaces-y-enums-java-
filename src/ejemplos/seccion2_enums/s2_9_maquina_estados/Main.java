package ejemplos.seccion2_enums.s2_9_maquina_estados;

public class Main {
    public static void main(String[] args) {
        EstadoPedido estado = EstadoPedido.RECIBIDO;
        while (!estado.esFinal()) {
            String cancelable = estado.puedeCancelarse() ? "sí" : "no";
            System.out.printf("%-15s ¿cancelable? %s%n", estado, cancelable);
            estado = estado.siguiente();
        }
        System.out.println(estado + " → fin del recorrido");

        try {
            EstadoPedido.LISTO.cancelar();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
