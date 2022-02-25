package paquete1;

public class Cuadrado {

    private int longitud;

    public Cuadrado(int longitud) {
        this.longitud = longitud;
    }

    public int getArea() {
        return longitud * longitud;
    }

    public int getPerimetro() {
        return longitud * 4;
    }

    public void duplicate() {
        longitud = longitud * 2;
    }

    public String toString() {
        return "Soy un cuadrado" + longitud;
    }

}
