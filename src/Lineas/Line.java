package Lineas;

public class Line {

    private Point origen;
    private Point destino;

    public Line(Point origen, Point destino){
        this.origen=origen;
        this.destino=destino;
    }

    public void moveRight(int distance){
        origen.moveRight(distance);
        destino.moveRight(distance);
    }

    public String toString(){
        return origen + " - " + destino;
    }


}
