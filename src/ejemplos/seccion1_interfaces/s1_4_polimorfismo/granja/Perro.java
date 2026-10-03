package ejemplos.seccion1_interfaces.s1_4_polimorfismo.granja;

public class Perro implements Sonoro {
    @Override
    public String hacerSonido() {
        return "¡Guau!";
    }

    public void traerPelota() {
        System.out.println("El perro trae la pelota.");
    }
}
