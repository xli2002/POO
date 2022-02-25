package Ajedrez.White;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Piezas.King;

public class WhiteKing extends King {
    public WhiteKing(Cell cell) {
        super(cell, ChessType.WHITE_KING);
        place();
    }
}
