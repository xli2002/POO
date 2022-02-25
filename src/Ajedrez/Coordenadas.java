package Ajedrez;

import java.util.Locale;

/**
 * Ajedrez
 *
 * @author Xinyu
 * @version 0.1
 */

public class Coordenadas {
    private int number;
    private char letter;

    /**
     * Coordenadas
     *
     * @param letter son las letras
     * @param number son los numeros
     */

    public Coordenadas(char letter, int number) {
        this.number = number;
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    /**
     * Movimiento de fichas
     * @return los movimientos en el tablero
     */

    public Coordenadas up() {
        return new Coordenadas(letter, number - 1);
    }

    public Coordenadas down() {
        return new Coordenadas(letter, number + 1);
    }

    public Coordenadas left() {
        return new Coordenadas((char) (letter - 1), number);
    }

    public Coordenadas right() {
        return new Coordenadas((char) (letter + 1), number);
    }

    public Coordenadas upRight() {
        return up().right();
    }

    public Coordenadas upLeft() {
        return up().left();
    }

    public Coordenadas downRight() {
        return down().right();
    }

    public Coordenadas downLeft() {
        return down().right();
    }
    
    public int hasCode(){
//        Coordenadas c1 = new Coordenadas('G',1);
//        Coordenadas c2 = c1.up().upLeft();
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Coordenadas))	return false;
        return ((Coordenadas) o).getLetter() == this.letter && ((Coordenadas) o).getNumber() == this.number;
    }
    
    /**
     * Muestra la ficha
     * @return letra + numero
     */
    public String toString() {
        return "(" + letter + "," + number + ")";
    }

}
