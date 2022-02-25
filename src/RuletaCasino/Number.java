package RuletaCasino;

import static RuletaCasino.RuletaColor.*;

public class Number {

    private static  int numero =0 ;
    private RuletaColor color;
    private int number;
    public Number(int number){
        this.number = number;
        this.color = (number==10 || number==28)?BLACK:setRuletaColor(number);
    }

    private RuletaColor setRuletaColor(int number) {
        if (number==0) return GREEN;
        if (number<10)
            return (number%2==0)?BLACK:RED;

        return setRuletaColor(suma(number));
    }

    public static int getNumero() {
        return numero;
    }

    private int suma(int number) {
        if (number<10)return number;
        return number%10 + suma(number/10);
    }

    @Override
    public String toString() {
        return  color.toString() + number + Color.RESET;
    }
}
