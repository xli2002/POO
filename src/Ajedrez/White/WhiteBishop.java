package Ajedrez.White;

import Ajedrez.Coordenadas;
import Ajedrez.Piezas.Bishop;
import Ajedrez.Cell;
import Ajedrez.ChessType;

public class WhiteBishop extends Bishop {
    public WhiteBishop(Cell cell) {
        super(cell, ChessType.WHITE_BISHOP);
        place();
    }

    @Override
    public Coordenadas[] getNextMove() {
        return new Coordenadas[0];
    }
}
