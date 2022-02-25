package Ajedrez.DynamicStructure;

import Ajedrez.ChessType;
import Ajedrez.Piece;

import java.util.List;

public class MyLinkedStore implements IDeletedPieceManager{

    private List<Piece> pieces;

    public MyLinkedStore(List<Piece> pieces) {
        this.pieces = pieces;
    }

    @Override
    public void add(Piece piece) {
        pieces.add(piece);
    }

    @Override
    public Piece getFirst() {
        return pieces.get(0);
    }

    @Override
    public void remove(Piece piece) {
        pieces.remove(piece);
    }

    @Override
    public int count(ChessType chessType) {
//       return (int)pieces.stream().filter(p->p.getChessType()==chessType).count();
        int suma=0;
        for (Piece piece : pieces)
            if (piece.getChessType()==chessType)
                suma++;
        return suma;
    }
}
