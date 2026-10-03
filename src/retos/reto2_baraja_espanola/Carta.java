package retos.reto2_baraja_espanola;

public record Carta(Valor valor, Palo palo) {
    @Override
    public String toString() {
        return valor.getNombre() + " de " + palo;
    }
}
