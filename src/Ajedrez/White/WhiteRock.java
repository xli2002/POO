package Ajedrez.White;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Coordenadas;
import Ajedrez.Piezas.Rock;

public class WhiteRock extends Rock {
    public WhiteRock(Cell cell) {
        super(cell, ChessType.WHITE_ROCK);
        place();
    }
    @Override
    public Coordenadas[] getNextMove() {
        return new Coordenadas[0];
    }
}
