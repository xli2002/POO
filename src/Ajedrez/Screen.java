package Ajedrez;
import Ajedrez.Board;
import Ajedrez.Coordenadas;
import Ajedrez.DynamicStructure.IDeletedPieceManager;
import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Screen {

    public static void show(IDeletedPieceManager store){
        String output = " ";

        for(ChessType chessType : ChessType.values()){
            output+=colorize(" "+ chessType.getShape() +" ",Cell.CellColor.BLACK_CELL.getAttribute(),chessType.getColor().getAttribute());
        }
        output+="\n";
        for(ChessType chessType : ChessType.values()) {
            output += colorize(" " + store.count(chessType) + " ", Cell.CellColor.WHITE_CELL.getAttribute(), Attribute.TEXT_COLOR(100, 100, 100));
        }

        System.out.println(output);
    }

    public static void show(Board board){

            String salida = "";
            Coordenadas c;
            for (int row = 0; row < 8; row++) {
                salida += (row + 1) + " ";
                for (int col = 0; col < 8; col++) {
                    c = new Coordenadas((char) ('A' + col), row + 1);
                    salida += board.getCellAt(c).toString();
                }
                salida += " " + (row + 1);
                salida += "\n";
            }
            System.out.println("   A" + "  B" + "  C" + "  D" + "  E" + "  F" + "  G" + "  H");
            salida += "   A" + "  B" + "  C" + "  D" + "  E" + "  F" + "  G" + "  H";
            System.out.println(salida);



    }

    public static void showrevese (Board board){

        String salida = "";
        Coordenadas c;
        for (int row = 8; row > 0; row--) {
            salida += (row) + " ";
            for (int col = 0; col <8 ; col++) {
                c = new Coordenadas((char) ('H' - col), row );
                salida += board.getCellAt(c).toString();
            }
            salida += " " + (row );
            salida += "\n";
        }
        System.out.println("   H" + "  G" + "  F" + "  E" + "  D" + "  C" + "  B" + "  A");
        salida += "   H" + "  G" + "  F" + "  E" + "  D" + "  C" + "  B" + "  A";
        System.out.println(salida);
    }
}





//    public static void show(Board board, PieceColor color){
//        if (color==PieceColor.WHITE)
//            showWhiteView(board);
//        else
//            showBlackView(board);
//    }
//
//    private static void showWhiteView(Board board){
//        StringBuilder salida = new StringBuilder();
//
//       salida.append(getLettersWhiteview());
//        for(int fila = 1; fila <=; fila++){
//            salida.append(getMiddlePartWhiteView(board,fila));
//    }
//
//    }


