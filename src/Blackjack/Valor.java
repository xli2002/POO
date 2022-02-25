package Blackjack;

public enum Valor {
//    AS(1),
//    DOS(2),
//    TRES(3),
//    CUATRO(4),
//    CINCO(5),
//    SEIS(6),
//    SIETE(7),
//    OCHO(8),
//    NUEVE(9),
//    SOTA(10),
//    REINA(11),
//    REY(12);
//
//    private final int valor;
//    private Valor (int valor){
//        this.valor=valor;
//    }
//    public int getValor(){
//        return valor;
//    }
    ACE("A",1,11),
    TWO("2",2),
    THREE("3",3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("11",11),
    QUEEN("12",12),
    KING("13",13);

    private int[] valores;
    private String forma;

    Valor(String forma,Integer...valores){
        this.valores=new int[valores.length];
        for (int i=0;i<valores.length;i++)
            this.valores[i]=valores[i];
        this.forma=forma;
    }

    public int[]getValores(){
        return valores;
    }

    public String toString() {
        return forma;
    }
}
