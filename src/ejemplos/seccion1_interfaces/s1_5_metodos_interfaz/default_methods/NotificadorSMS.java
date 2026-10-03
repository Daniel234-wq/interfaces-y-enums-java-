package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.default_methods;

public class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("SMS → " + mensaje);
    }

    @Override
    public void enviarUrgente(String mensaje) { // decide cambiarlo
        enviar("!!! " + mensaje + " (responde SI)");
    }
}
