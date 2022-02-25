package Ajedrez;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Cell {
    private Coordenadas coordenadas;
    private CellColor color;
    private CellColor originalColor;
    private Piece piece;
    private Board board;

    public Cell(Board board, Coordenadas coordenadas){
        this.board=board;
        this.coordenadas=coordenadas;
        if(((coordenadas.getLetter()-'A')+coordenadas.getNumber())%2==0)
            originalColor=CellColor.BLACK_CELL;
        else
            originalColor=CellColor.WHITE_CELL;

        color=originalColor;
    }

    public String toString(){
        Attribute[] myFormat = new Attribute[]{color.getAttribute()};
        if (piece!=null)
            return piece.toString();
        else
            return colorize("   ",myFormat);
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Board getBoard() {
        return board;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public Piece getPiece() {
        return piece;
    }

    public CellColor getColor() {
        return color;
    }

    public void hightLight() {
        if(piece!=null)
            color= (originalColor==CellColor.WHITE_CELL)?CellColor.HIGHTLIGHT_KILL_WHITE:CellColor.HIGHTLIGHT_KILL_BLACK;
        else
            color= (originalColor==CellColor.WHITE_CELL)?CellColor.HIGHTLIGHT_WHITE:CellColor.HIGHTLIGHT_BLACK;
    }
    public void resetColor(){
        color=originalColor;
    }

    public enum CellColor{
        WHITE_CELL(Attribute.BACK_COLOR(169,175,148)),
        BLACK_CELL(Attribute.BACK_COLOR(100,111,80)),
        HIGHTLIGHT_KILL_WHITE(Attribute.BACK_COLOR(180,0,0)),
        HIGHTLIGHT_KILL_BLACK(Attribute.BACK_COLOR(130,0,0)),
        HIGHTLIGHT_WHITE(Attribute.BACK_COLOR(180,180,0)),
        HIGHTLIGHT_BLACK(Attribute.BACK_COLOR(130,130,0));

        private Attribute color;
        CellColor(Attribute color){
            this.color=color;
        }
        public Attribute getAttribute() {
            return color;
        }
    }
}
