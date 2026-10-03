package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.default_methods;

public class Main {
    public static void main(String[] args) {
        Notificador[] canales = { new NotificadorEmail(), new NotificadorSMS() };
        for (Notificador n : canales) {
            n.enviar("Tu pedido fue enviado");
            n.enviarUrgente("Tu clave expira hoy");
        }
    }
}
