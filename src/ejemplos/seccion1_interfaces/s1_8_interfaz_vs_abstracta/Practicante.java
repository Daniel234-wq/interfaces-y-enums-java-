package ejemplos.seccion1_interfaces.s1_8_interfaz_vs_abstracta;

public class Practicante extends Empleado {
    public Practicante(String nombre, double base) {
        super(nombre, base);
    }

    @Override
    public double salarioMensual() {
        return salarioBase;
    }
}
