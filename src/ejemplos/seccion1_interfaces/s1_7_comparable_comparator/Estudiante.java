package ejemplos.seccion1_interfaces.s1_7_comparable_comparator;

public class Estudiante implements Comparable<Estudiante> {
    private final String nombre;
    private final double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    // Orden natural: alfabético por nombre
    @Override
    public int compareTo(Estudiante otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + promedio + ")";
    }
}
