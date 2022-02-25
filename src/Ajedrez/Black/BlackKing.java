package Ajedrez.Black;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Piezas.King;

public class BlackKing extends King {
    public BlackKing(Cell cell) {
        super(cell, ChessType.BLACK_KING);
        place();
    }
}
