package Ajedrez;

public class Game {

    private String whitePlayer;
    private String blackPlayer;
    private Board board;
    private PieceColor turno;

    public Game(){
        board = new Board();
        turno=PieceColor.WHITE;
    }
    public void start(){

    }
}
