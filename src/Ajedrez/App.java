package Ajedrez;

import Ajedrez.Black.BlackPawn;
import Ajedrez.DynamicStructure.IDeletedPieceManager;


public class App {
    public static void main(String[] args) {



        Board board = new Board();
        Screen.show(board);
//        System.out.println();
//        Screen.showrevese(board);
        System.out.println();
//        Screen.show(board.store);



//        Cell cell = new Cell(board,new Coordenadas('B',8));
//        System.out.println(board);
//
//        IDeletedPieceManager myPieceManager = new Mylist();
//
//        myPieceManager.add(new BlackPawn(board.getCellAt(new Coordenadas('A',1))));
//        myPieceManager.add(new BlackPawn(board.getCellAt(new Coordenadas('A',4))));
//        myPieceManager.add(new BlackPawn(board.getCellAt(new Coordenadas('A',3))));
//        myPieceManager.add(new BlackPawn(board.getCellAt(new Coordenadas('A',2))));
//
//        System.out.println(myPieceManager.count(ChessType.BLACK_PAWN));
//        Piece p;
//        while ((p=myPieceManager.getFirst())!=null)
//            System.out.print(p);
    }
}
