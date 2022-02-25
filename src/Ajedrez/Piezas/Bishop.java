package Ajedrez.Piezas;

import Ajedrez.*;

public abstract class Bishop extends Piece {
    public Bishop(Cell cell, ChessType chessType ) {
        super(cell, chessType);
    }

    public static Coordenadas[] getnextMovementsAsBishop(Piece piece) {

        Board board = piece.cell.getBoard();
        Coordenadas[] nextMovements = new Coordenadas[0];
        Coordenadas origin = piece.cell.getCoordenadas();
        Coordenadas aux;

        aux = origin.up().left();
        while (board.conteinsCellAt(aux) && !board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }

        aux = origin.up().right();
        while (board.conteinsCellAt(aux) && !board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }

        aux = origin.down().left();
        while (board.conteinsCellAt(aux) && !board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }

        aux = origin.down().right();
        while (board.conteinsCellAt(aux) && !board.conteinsPieceAt(aux)) {
            nextMovements = Tool.add(nextMovements, aux);
        }

        return nextMovements;
    }
}
