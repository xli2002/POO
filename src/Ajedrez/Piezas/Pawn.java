package Ajedrez.Piezas;

import Ajedrez.*;

public abstract class Pawn extends Piece {
    public Pawn(Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    public Coordenadas[] getNextMove() {

        Coordenadas[] nextMovements = new Coordenadas[0];
        Coordenadas position = cell.getCoordenadas();
        Coordenadas aux;

        return nextMovements;
    }
}
