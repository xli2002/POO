package Ajedrez.Piezas;

import Ajedrez.*;

public abstract class Rock extends Piece {
        public Rock(Cell cell, ChessType chessType){
            super(cell,chessType);
        }

    public static Coordenadas[] getNextMovementsAsRock(Piece piece) {

        Board board = piece.cell.getBoard();
        Coordenadas[] nextMovements = new Coordenadas[0];
        Coordenadas origin = piece.cell.getCoordenadas();
        Coordenadas aux;

        aux = origin.up();
        while (board.conteinsCellAt(aux)&&!board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }
        aux = origin.down();
        while (board.conteinsCellAt(aux)&&!board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }
        aux = origin.left();
        while (board.conteinsCellAt(aux)&&!board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }
        aux = origin.right();
        while (board.conteinsCellAt(aux)&&!board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }

        return nextMovements;
    }
}
