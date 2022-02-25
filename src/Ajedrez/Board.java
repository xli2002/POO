package Ajedrez;

import Ajedrez.Black.*;
import Ajedrez.DynamicStructure.IDeletedPieceManager;
import Ajedrez.DynamicStructure.Mylist;
import Ajedrez.White.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
//    private Map<Coordenadas,Cell>cells;
    private Cell[][] cells;
    IDeletedPieceManager store;

    public Board(){
        cells = new Cell[8][8];

        for (int row=1;row<=8;row++){
            for (int col=0;col<8;col++){
                cells[row-1][col] = new Cell(this,new Coordenadas((char)('A'+col),row));
            }
        }

        placePieces();
    }
//    public Board() {
////        cells = new HashMap<>();
//        store = new Mylist();
//
//        Coordenadas coordenadas;
//        Cell cell;
//
//        for (int row = 1; row <= 8; row++) {
//            for (int col = 0; col < 8; col++) {
//                coordenadas = new Coordenadas((char)('A'+col),row);
//                cell=new Cell(this,new Coordenadas((char) ('A' + col), row));
////                cells.put(coordenadas,cell);
//            }
//        }
//        placePieces();
//    }

    private void placePieces() {
        for (int i = 0; i < 8; i++) {
            new BlackPawn(cells[1][i]);
            new WhitePawn(cells[6][i]);
        }
        new BlackRock(cells[0][0]);
        new BlackRock(cells[0][7]);
        new WhiteRock(cells[7][0]);
        new WhiteRock(cells[7][7]);
        new BlackKnight(cells[0][1]);
        new BlackKnight(cells[0][6]);
        new WhiteKnight(cells[7][1]);
        new WhiteKnight(cells[7][6]);
        new BlackBishop(cells[0][2]);
        new BlackBishop(cells[0][5]);
        new WhiteBishop(cells[7][2]);
        new WhiteBishop(cells[7][5]);
        new BlackKing(cells[0][4]);
        new WhiteKing(cells[7][4]);
        new BlackQueen(cells[0][3]);
        new WhiteQueen(cells[7][3]);
    }

    public IDeletedPieceManager getStore() {
        return store;
    }

    public Cell[][] getCells() {
        return cells;
    }
    public boolean conteinsCellAt(Coordenadas coordenadas){
        if (coordenadas.getLetter()<'A' || coordenadas.getLetter()>'H')
            return false;
        if (coordenadas.getNumber()<1 || coordenadas.getNumber()>8)
            return false;

        return true;
    }
    public boolean conteinsPieceAt(Coordenadas coordenadas){
        Cell cell = getCellAt(coordenadas);
        if (cell == null) return false;
        return (cell.getPiece()!=null);
    }

    public Cell getCellAt(Coordenadas coordenadas){
        return cells[(coordenadas.getNumber()-1)][(coordenadas.getLetter()-'A')];
    }


    @Override
    public String toString() {
        String salida="";
        Coordenadas c = null;
        for (int row = 0; row < 8; row++) {
            salida+=(row+1)+" ";
            for (int col = 0; col < 8; col++) {
                salida+=cells[row][col].toString();
            }
            salida+=" "+(row+1);
            salida+="\n";
        }
        salida+="   A" + "  B"+ "  C"+ "  D"+ "  E" + "  F"+ "  G"+ "  H";
        System.out.println("   A" + "  B"+ "  C"+ "  D"+ "  E" + "  F"+ "  G"+ "  H");
        return salida ;
    }

    public void hightLight(Coordenadas[] coordenadas){
        for(Coordenadas coordenada : coordenadas)
            getCellAt(coordenada).hightLight();
    }
    public void resetColors(){
        for(Cell[] rowCells: cells)
            for(Cell cell : rowCells)
                cell.resetColor();
    }
//    public List<Piece> getWhitePieces(){
//        List<Piece>pieces = new ArrayList<>();
//        for (Cell cell : cells.values())
//            if (cell.getPiece()!=null&&cell.getPiece().getColor()==PieceColor.WHITE);
//    }
}

