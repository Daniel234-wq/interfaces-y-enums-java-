package ejemplos.seccion1_interfaces.s1_8_interfaz_vs_abstracta;

public abstract class Empleado { // FAMILIA: estado + código común
    protected final String nombre;
    protected final double salarioBase;

    protected Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double salarioMensual();

    public String resumen() {
        return String.format("%-7s $%,.0f", nombre, salarioMensual());
    }
}
