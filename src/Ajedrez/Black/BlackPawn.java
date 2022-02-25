package Ajedrez.Black;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Coordenadas;
import Ajedrez.Piece;
import Ajedrez.Piezas.Pawn;

public class BlackPawn extends Pawn {
    public BlackPawn(Cell cell) {
        super(cell, ChessType.BLACK_PAWN);
        cell.setPiece(this);
    }

    @Override
    public Coordenadas[] getNextMove() {
        return new Coordenadas[0];
    }
}
