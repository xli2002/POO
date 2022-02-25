package Ajedrez.Piezas;

import Ajedrez.*;

public abstract class King extends Piece {
    public King(Cell cell, ChessType chessType){
        super(cell,chessType);
    }
    public Coordenadas[] getNextMove() {

        Coordenadas[] nextMovements = new Coordenadas[0];
        Coordenadas position = cell.getCoordenadas();
        Coordenadas aux;

        aux=position.up();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.upRight();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.right();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.downRight();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.down();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.downLeft();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.left();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.upLeft();;
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        return nextMovements;
    }

}
