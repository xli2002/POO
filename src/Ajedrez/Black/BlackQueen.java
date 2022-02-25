package Ajedrez.Black;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Piezas.Queen;

public class BlackQueen extends Queen {
    public BlackQueen(Cell cell){
        super(cell, ChessType.BLACK_QUEEN);
        place();
    }
}
