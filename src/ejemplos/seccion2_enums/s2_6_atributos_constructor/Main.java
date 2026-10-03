package ejemplos.seccion2_enums.s2_6_atributos_constructor;

public class Main {
    public static void main(String[] args) {
        for (Moneda m : Moneda.values()) {
            System.out.printf("%s %-21s %s%n", m, m.getNombre(), m.formatear(1));
        }

        double pesos = Moneda.USD.convertirA(Moneda.COP, 25);
        System.out.println(Moneda.USD.formatear(25) + " = " + Moneda.COP.formatear(pesos));

        double mxn = Moneda.EUR.convertirA(Moneda.MXN, 100);
        System.out.println(Moneda.EUR.formatear(100) + " = " + Moneda.MXN.formatear(mxn));

        System.out.println("Símbolo € → " + Moneda.desdeSimbolo("€").getNombre());
    }
}
