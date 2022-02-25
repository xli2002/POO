package Lineas;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        x=0;
        y=0;
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    public void moveRight(int distance){
        this.x += distance;
    }
    public void moveLeft(int distance){this.x += distance;}
    public void moveUp(int distance){
        this.y += distance;
    }
    public void moveDown(int distance){
        this.y += distance;
    }
    public void moveDiagonaUpRigth(int distance){moveUp(distance);moveRight(distance);
    }
}

