package Blackjack;

public class Carta {
    private Valor valor;
    private Palo palo;

    public Carta(Palo palo, Valor valor){
        this.palo=palo;
        this.valor=valor;
    }

    public Valor getValor(){
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public String toString() {
        return " " + valor.toString() +
                palo ;
    }
}
