package fracciones;

public class App {
    public static void main(String[] args) {
        Racional r1 = new Racional(1,4);
        System.out.println(r1.suma((new Racional(2,2))));
    }
}
