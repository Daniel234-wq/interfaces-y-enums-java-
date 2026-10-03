package ejemplos.seccion1_interfaces.s1_4_polimorfismo.herencia_interfaces;

public class Main {
    public static void main(String[] args) {
        DispositivoInteligente d = new Parlante();
        d.encender();
        d.conectarWifi("Casa_5G");
        System.out.println(d.asistente());

        Encendible soloEnciende = d; // también ES Encendible
        soloEnciende.apagar();
    }
}
