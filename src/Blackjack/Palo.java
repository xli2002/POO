package Blackjack;

import static Blackjack.CardColor.*;

public enum Palo {
//    OROS,ESPADAS,COPAS,BASTOS

    PICAS('♠', BLACK), CORAZON('♥', RED), ROMBO('♦', BLACK), TREBOL('♣', RED);

    private final char palo;
    private final CardColor color;

    Palo(char palo, CardColor color) {
        this.palo = palo;
        this.color = color;
    }

    public String toString() {
        return color.toString() + palo + Color.RESET;
    }
}