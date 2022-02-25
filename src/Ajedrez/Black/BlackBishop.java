package Ajedrez.Black;

import Ajedrez.Coordenadas;
import Ajedrez.Piezas.Bishop;
import Ajedrez.Cell;
import Ajedrez.ChessType;

public class BlackBishop extends Bishop {
    public BlackBishop(Cell cell) {
        super(cell, ChessType.BLACK_BISHOP);
        place();
    }

    @Override
    public Coordenadas[] getNextMove() {
        return new Coordenadas[0];
    }
}
