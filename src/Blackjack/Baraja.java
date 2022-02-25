package Blackjack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private Carta[] cartas;
    private int arriba;
    private int abajo;

    public Baraja() {
        cartas = new Carta[Palo.values().length * Valor.values().length];
        int i = 0;
        for (Palo p : Palo.values()) {
            for (Valor v : Valor.values()) {
                cartas[i++] = new Carta(p,v);
            }
        }
        abajo = 0;
        arriba = cartas.length - 1;
    }

    public Carta up() {
        return (hayCartas()) ? cartas[arriba--] : null;
    }

    public Carta down() {
        return (hayCartas()) ? cartas[abajo++] : null;
    }

    private boolean hayCartas() {
        return abajo <= arriba;
    }

    public void barajar() {
        if (abajo == 0 && arriba == cartas.length - 1) {
            List<Carta> c = Arrays.asList(cartas);
            Collections.shuffle(c);
            cartas = c.toArray(new Carta[0]);
        }
    }

    public String toString() {
        String salida="";
        for (Carta carta : cartas)
            salida += carta + "\n";

        return salida;
    }
}
