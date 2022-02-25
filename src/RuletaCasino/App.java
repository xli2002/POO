package RuletaCasino;

public class App {
    public static void main(String[] args) {
//        Ruleta ruleta = new Ruleta();
//        for (int i=0;i<=36;i++)
//            System.out.println(ruleta.getRandomNUmber());

        Apuesta apuesta = new Apuesta(RuletaColor.BLACK,30000);
        System.out.println(apuesta);

    }
}
