package ejemplos.seccion1_interfaces.s1_5_metodos_interfaz.diamante;

public class Artista implements Cantante, Bailarin {
    @Override
    public String presentarse() {
        return "Yo " + Cantante.super.presentarse()
                + " y " + Bailarin.super.presentarse();
    }
}
