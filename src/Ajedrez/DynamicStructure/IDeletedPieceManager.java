package Ajedrez.DynamicStructure;

import Ajedrez.ChessType;
import Ajedrez.Piece;

public interface IDeletedPieceManager {
    void add(Piece piece);
    Piece getFirst();
    void remove(Piece piece);
    int count(ChessType chessType);
}
