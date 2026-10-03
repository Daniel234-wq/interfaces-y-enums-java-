package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.default_methods;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Email → " + mensaje);
    }
    // No sobrescribe enviarUrgente: usa la versión de la interfaz
}
