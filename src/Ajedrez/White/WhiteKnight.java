package Ajedrez.White;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Piezas.Knigth;

public class WhiteKnight extends Knigth {
    public WhiteKnight(Cell cell) {
        super(cell, ChessType.WHITE_KNIGHT);
        place();
    }
}
