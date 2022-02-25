package Ajedrez.White;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Coordenadas;
import Ajedrez.Piece;
import Ajedrez.Piezas.Pawn;

public class WhitePawn extends Pawn {
    public WhitePawn(Cell cell) {
        super(cell, ChessType.WHITE_PAWN);
        cell.setPiece(this);
    }

    @Override
    public Coordenadas[] getNextMove() {
        return new Coordenadas[0];
    }
}
