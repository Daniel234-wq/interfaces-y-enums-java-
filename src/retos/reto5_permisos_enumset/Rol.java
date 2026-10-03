package retos.reto5_permisos_enumset;

import java.util.EnumSet;

public enum Rol {
    INVITADO(EnumSet.of(Permiso.LEER)),
    USUARIO(EnumSet.of(Permiso.LEER, Permiso.ESCRIBIR)),
    EDITOR(EnumSet.of(Permiso.LEER, Permiso.ESCRIBIR, Permiso.BORRAR)),
    ADMINISTRADOR(EnumSet.allOf(Permiso.class));

    private final EnumSet<Permiso> permisos;

    Rol(EnumSet<Permiso> permisos) {
        this.permisos = permisos;
    }

    public boolean puede(Permiso p) {
        return permisos.contains(p);
    }

    public EnumSet<Permiso> getPermisos() {
        return EnumSet.copyOf(permisos);
    }
}
