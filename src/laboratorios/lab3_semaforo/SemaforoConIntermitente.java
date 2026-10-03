package laboratorios.lab3_semaforo;

// Reto extra (paso 6): se agrega AMARILLO_INTERMITENTE.
// Al agregarlo, el compilador exige exhaustividad en la expresión switch.
public enum SemaforoConIntermitente {
    VERDE(30, "Avance"),
    AMARILLO(5, "Precaución"),
    ROJO(35, "Pare"),
    AMARILLO_INTERMITENTE(10, "Precaución intermitente");

    private final int segundos;
    private final String accion;

    SemaforoConIntermitente(int segundos, String accion) {
        this.segundos = segundos;
        this.accion = accion;
    }

    public int getSegundos() {
        return segundos;
    }

    public String getAccion() {
        return accion;
    }

    public SemaforoConIntermitente siguiente() {
        return switch (this) {
            case VERDE -> AMARILLO;
            case AMARILLO -> ROJO;
            case ROJO -> AMARILLO_INTERMITENTE;
            case AMARILLO_INTERMITENTE -> VERDE;
        };
    }

    public static int duracionCiclo() {
        int total = 0;
        for (SemaforoConIntermitente s : values()) {
            total += s.segundos;
        }
        return total;
    }
}
