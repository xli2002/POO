package Ajedrez.DynamicStructure;

import Ajedrez.ChessType;
import Ajedrez.Piece;

public class Mylist implements IDeletedPieceManager{
    private Node head;
    private int size;

    @Override
    public void add(Piece piece) {
        Node aux = new Node(piece);
        if (head==null)
            head=aux;
        else{
            aux.setNext(head);
            head=aux;
        }
        size++;
    }

    @Override
    public void remove(Piece piece) {
        if (head == null)
            return;
        if (head.getInfo().equals(piece)){
            head = head.getNext();
        size--;
    }
        else{
            Node aux2=head,aux1=head.getNext();
            while (aux1!=null && aux1.getInfo()!=piece){
                aux2=aux1;
                aux1=aux1.getNext();
            }
        }
    }

    @Override
    public Piece getFirst() {
        if (head==null)
            return null;
        else {
            Piece p = head.getInfo();
            head = head.getNext();
            return p;
        }
    }

    @Override
    public int count(ChessType chessType) {

        int count = 0;
        Node aux = head;

        while (aux!=null){
            if(aux.getInfo().getChessType().equals(chessType))
                count++;

            aux = aux.getNext();

        }

        return count;
    }
}
