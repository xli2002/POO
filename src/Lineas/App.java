package Lineas;

import Lineas.Point;
import Lineas.Polygon;

public class App {
    public static void main(String[] args) {

        Point point = new Point(3,3);
        Point point2 = new Point(8,6);
        Point point3 = new Point(8,3);

        Polygon polygon = new Polygon(point,point2,point3);
//        Line line = new Line(point,point2);
//        line.moveRight(3);

        System.out.println(polygon);


//        point.moveRight(3);
//        point.moveLeft(3);
//        point.moveUp(3);
//        point.moveDown(2);

//      Persona p1 = new Persona("Manolo",1.84f,20);
//        System.out.println(p1.getNombre());

    }
}
