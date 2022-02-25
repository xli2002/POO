package Ajedrez.Black;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Coordenadas;
import Ajedrez.Piezas.Rock;

public class BlackRock extends Rock {
    public BlackRock(Cell cell) {
        super(cell, ChessType.BLACK_ROCK);
        place();
    }
    @Override
    public Coordenadas[] getNextMove() {
        return new Coordenadas[0];
    }
}
