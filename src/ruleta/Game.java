package ruleta;

import java.util.Scanner;


public class Game {

    private Jugador player1;
    private Jugador player2;
    private Jugador turno;

    private void inicializar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el nombre del jugador 1:");
        String nombre1 = sc.next();
        System.out.println("Dame el nombre del jugador 2:");
        String nombre2 = sc.next();
        player1 = new Jugador(nombre1);
        player2 = new Jugador(nombre2);
        turno = player1;
    }

    public void start() {
        inicializar();

        while (player1.isAlive() && player2.isAlive()) {
            juega(turno);
            if (!turno.isAlive())
                System.out.println("Se ha muerto " + turno.getNombre());
            cambioTurno();
        }
    }

    private void cambioTurno() {
        if (turno == player1)
            turno = player2;
        else
            turno = player1;
    }

    private void juega(Jugador jugador) {
        System.out.println("Juega " + jugador.getNombre());
        System.out.println("[0] - Disparar");
        System.out.println("[1] - Rotar + Disparar");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        if (opcion == 1)
            jugador.rotar();

        jugador.disparar();

    }
}
