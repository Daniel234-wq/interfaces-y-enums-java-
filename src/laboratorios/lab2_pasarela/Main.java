package laboratorios.lab2_pasarela;

public class Main {
    public static void main(String[] args) {
        // Cuatro casos base de la guía
        Caja.cobrar(new TarjetaCredito(500_000), 120_000);
        Caja.cobrar(new BilleteraDigital(50_000), 80_000);
        Caja.cobrar(new Efectivo(), 35_000);
        Caja.cobrar(new TarjetaCredito(100_000), 99_000); // 99.000 + 2.970 > cupo

        // Quinto caso solicitado en el paso 6 (sin modificar Caja):
        Caja.cobrar(new Criptomoneda(200_000, 1_500), 150_000);
    }
}
