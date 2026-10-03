package ejemplos.seccion2_enums.s2_11_singleton;

public enum Configuracion {
    INSTANCIA; // el único objeto que existirá

    private String idioma = "es";
    private int volumen = 50;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = Math.clamp(volumen, 0, 100);
    }
}
