package Lineas;

public class Polygon {
    private Point [] points;

    public Polygon(Point... points){
        this.points = new Point[points.length];
        int i=0;
        for (Point point : points)
            this.points[i++]=point;
    }

    public String toString(){
        String output="";
        for (Point point : points)
            output+= point + " ";
        return output;
    }
}
