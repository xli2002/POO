package Ajedrez;

import com.diogonunes.jcolor.Attribute;
import org.w3c.dom.Attr;

import static com.diogonunes.jcolor.Ansi.colorize;

public abstract class Piece {

    private ChessType chessType;
    public Cell cell;

    public Cell getCell() {
        return cell;
    }


    public Piece(Cell cell, ChessType chessType) {
        this.cell = cell;
        this.chessType = chessType;
    }

    public String toString() {
        Attribute background = cell.getColor().getAttribute();
        Attribute textColor = chessType.getColor().getAttribute();
        Attribute[] myFormat = new Attribute[]{background, textColor};

        return colorize(" " + chessType.getShape() + " ", myFormat);
    }
    public void place(){
        cell.setPiece(this);
    }

    public ChessType getChessType() {
        return chessType;
    }

    public PieceColor getColor(){
        return this.chessType.getColor();
    }

    protected boolean canMoveTo(Coordenadas coordenadas){
        Board board = cell.getBoard();

        return (board.conteinsCellAt(coordenadas) && !board.conteinsPieceAt(coordenadas) )||
                (board.conteinsCellAt(coordenadas) &&
                        board.conteinsPieceAt(coordenadas) &&
                        board.getCellAt(coordenadas).getPiece().getColor()!=getColor());
    }

//    public boolean moveTo(Coordenadas c){
//        if (cell==null || !cell.getBoard().conteinsCellAt(c))
//            return false;
//
//        if (Tool.contains(getNextMove(),c)){
//            Board board = cell.getBoard();
//            if (cell.getBoard().conteinsCellAt(c)){
//                Piece piece = board.getCellAt(c).getPiece();
//                piece.cell=null;
//                board.getStore().add(piece);
//            }
//            cell.setPiece(null);
//            cell = board.getCellAt(c);
//            place();
//            return true;
//        }else
//            return false;
//    }
//

    @Override
    public boolean equals(Object o) {
        if (o instanceof Piece) {
            Piece p = (Piece) o;
            if (p.cell == this.cell && p.chessType == this.chessType) {
                return true;
            } else
                return false;
        } else return false;
    }
    public abstract Coordenadas[] getNextMove();

}

