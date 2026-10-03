package ejemplos.seccion2_enums.s2_8_enums_interfaces;

public enum Impuesto implements Calculable { // el enum firma el contrato
    IVA_GENERAL(0.19),
    IVA_REDUCIDO(0.05),
    EXENTO(0.0);

    private final double tasa;

    Impuesto(double tasa) {
        this.tasa = tasa;
    }

    @Override
    public double calcular(double base) {
        return base * tasa;
    }
}
