package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.default_methods;

public interface Notificador {
    void enviar(String mensaje); // abstracto: cada clase decide

    default void enviarUrgente(String mensaje) { // default: ya viene resuelto
        enviar("[URGENTE] " + mensaje.toUpperCase());
    }
}
