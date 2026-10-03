package retos.reto5_permisos_enumset;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Reto 5: Permisos con EnumSet ===");

        Rol invitado = Rol.INVITADO;
        Rol editor = Rol.EDITOR;
        Rol admin = Rol.ADMINISTRADOR;

        // Comprobación explícita solicitada: un INVITADO no puede borrar
        System.out.println("¿INVITADO puede BORRAR? " + invitado.puede(Permiso.BORRAR));
        System.out.println("¿INVITADO puede LEER?   " + invitado.puede(Permiso.LEER));

        System.out.println("\nPermisos de EDITOR:");
        for (Permiso p : Permiso.values()) {
            System.out.printf(" - %-12s: %s%n", p, editor.puede(p) ? "PERMITIDO" : "DENEGADO");
        }

        System.out.println("\n¿ADMINISTRADOR puede ADMINISTRAR? " + admin.puede(Permiso.ADMINISTRAR));
    }
}
