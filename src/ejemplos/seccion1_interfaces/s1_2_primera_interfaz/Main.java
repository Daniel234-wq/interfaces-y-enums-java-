package ejemplos.seccion1_interfaces.s1_2_primera_interfaz;

public class Main {
    public static void main(String[] args) {
        Sonoro firulais = new Perro(); // tipo declarado: Sonoro
        Sonoro michi = new Gato();       // tipo real: Gato

        System.out.println(firulais.hacerSonido());
        System.out.println(michi.hacerSonido());
    }
}
