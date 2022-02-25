package Ajedrez.Black;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Piezas.Knigth;

public class BlackKnight extends Knigth {
    public BlackKnight(Cell cell) {
        super(cell, ChessType.BLACK_KNIGHT);
        place();
    }
}
