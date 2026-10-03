package ejemplos.seccion1_interfaces.s1_8_interfaz_vs_abstracta;

public class Desarrollador extends Empleado implements Bonificable {
    public Desarrollador(String nombre, double base) {
        super(nombre, base);
    }

    @Override
    public double bono() {
        return salarioBase * 0.15;
    }

    @Override
    public double salarioMensual() {
        return salarioBase + bono();
    }
}
