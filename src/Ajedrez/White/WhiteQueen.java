package Ajedrez.White;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Piezas.Queen;

public class WhiteQueen extends Queen {
    public WhiteQueen(Cell cell){
        super(cell, ChessType.WHITE_QUEEN);
        place();
    }
}
