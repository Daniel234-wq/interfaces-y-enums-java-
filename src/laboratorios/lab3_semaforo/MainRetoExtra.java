package laboratorios.lab3_semaforo;

public class MainRetoExtra {
    public static void main(String[] args) {
        System.out.println("--- Simulación con Reto Extra (AMARILLO_INTERMITENTE) ---");
        SemaforoConIntermitente luz = SemaforoConIntermitente.VERDE;
        for (int paso = 1; paso <= 5; paso++) {
            System.out.printf("Paso %d: %-22s %2d s → %s%n",
                    paso, luz, luz.getSegundos(), luz.getAccion());
            luz = luz.siguiente();
        }
        System.out.println("Duración del ciclo completo: " + SemaforoConIntermitente.duracionCiclo() + " s");
    }
}
