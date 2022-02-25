package Ajedrez.DynamicStructure;

import Ajedrez.Piece;

public class Node {
    private Piece info;
    private Node next;
    public Node(Piece piece){
        info = piece;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Piece getInfo() {
        return info;
    }

    public void setInfo(Piece info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info.toString();
    }
}
