package Blackjack;

import static Blackjack.Valor.ACE;

public class Jugador {
    private String nombre;
    private Carta[] mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new Carta[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void add(Carta carta) {
        Carta[] aux = new Carta[mano.length + 1];
        int i = 0;
        for (Carta c : mano)
            aux[i++] = c;
        aux[i] = carta;
        mano = aux;
    }

    public String toString() {
        String output = "Nombre del " + this.nombre + "\n";
        output += "Puntuacion: " + puntuacion() + "\n";
        for (Carta carta : mano)
            output += carta + " ";
        return output;
    }

    public int puntuacion(){
        return puntuacion(0,0);
    }

    private int puntuacion(int index, int suma) {
        if (suma > 21) return -1;
        if (index == mano.length) return suma;

        if (mano[index].getValor() == ACE) {
            return Math.max(puntuacion(index+1,suma +1),puntuacion(index+1,suma+11));
        }
        return puntuacion(index + 1, suma + mano[index].getValor().getValores()[0]);
    }

//    public String puntuacion(){
//        int suma = 0;
//        for (Carta carta : mano)
//            suma+=Carta.getValor().getValores()[0];
//        return ;
//    }
}