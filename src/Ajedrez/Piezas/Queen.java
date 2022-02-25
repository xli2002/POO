package Ajedrez.Piezas;

import Ajedrez.Cell;
import Ajedrez.ChessType;
import Ajedrez.Coordenadas;
import Ajedrez.Piece;

public abstract class Queen extends Piece {
    public Queen (Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    public Coordenadas[] getNextMove() {

        Coordenadas[] nextMovements = new Coordenadas[0];
        Coordenadas position = cell.getCoordenadas();
        Coordenadas aux;


        return nextMovements;
    }




}
