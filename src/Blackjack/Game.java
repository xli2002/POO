package Blackjack;

public class Game {
    private Jugador[] jugadores;
    private Jugador pc;
    private Baraja baraja;

    public Game(int jugadores) {
        this.jugadores = new Jugador[jugadores];
        this.pc= new Jugador("Robot");
        for (int i = 0; i < jugadores; i++)
            this.jugadores[i] = new Jugador("Juagdor " + (i + 1));
        baraja = new Baraja();
    }


    public void start() {

        baraja.barajar();

        for (Jugador jugador : jugadores) {

            do {
                jugador.add(baraja.up());
                System.out.println(jugador);
            } while (jugador.puntuacion() != -1 && Input.getOption("Do you want another card? ") == 'Y');
        }
        do {
            pc.add(baraja.up());
            System.out.println(pc);
        } while (pc.puntuacion() != -1 && !win());
    }

    private boolean win() {
        boolean found = false;

        int i = 0;
        while(i< jugadores.length && jugadores[i].puntuacion()<=pc.puntuacion())
            i++;

        if (i< jugadores.length)
            found=true;

        return !found;
    }

}



