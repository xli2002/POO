package Ajedrez.Piezas;

import Ajedrez.*;

public abstract  class Knigth extends Piece {
    public Knigth(Cell cell, ChessType chessType){
        super(cell,chessType);
    }

    public Coordenadas[] getNextMove() {

        Coordenadas[] nextMovements = new Coordenadas[0];
        Coordenadas position = cell.getCoordenadas();
        Coordenadas aux;

        aux=position.up().upLeft();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.up().upRight();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.down().downLeft();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.down().downRight();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.left().left().downLeft();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.left().left().upLeft();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.right().right().downRight();
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        aux= position.right().right().upRight();;
        if (canMoveTo(aux))
            nextMovements = Tool.add(nextMovements,aux);

        return nextMovements;
    }

}
