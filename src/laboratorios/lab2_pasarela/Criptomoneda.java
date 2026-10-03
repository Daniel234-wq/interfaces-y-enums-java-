package laboratorios.lab2_pasarela;

// Quinto método de pago solicitado en el paso 6 del Laboratorio 2
public class Criptomoneda implements MetodoPago {
    private double saldoUSDT;
    private final double comisionRed; // Comisión fija de red blockchain

    public Criptomoneda(double saldoUSDT, double comisionRed) {
        this.saldoUSDT = saldoUSDT;
        this.comisionRed = comisionRed;
    }

    @Override
    public String nombre() {
        return "Criptomoneda";
    }

    @Override
    public double comision(double monto) {
        return comisionRed;
    }

    @Override
    public boolean pagar(double monto) {
        double total = totalACobrar(monto);
        if (total > saldoUSDT) {
            return false;
        }
        saldoUSDT -= total;
        return true;
    }
}
