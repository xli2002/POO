package fracciones;

public class Racional {
    private int numerador;
    private int denominador;
    public Racional(int numerador,int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        int mcd = MCD();
        this.numerador = numerador/mcd;
        this.denominador = denominador/mcd;
    }

    public Racional suma(Racional racional){
        return new Racional(racional.numerador*denominador+numerador*denominador,racional.denominador*denominador);
    }

    public Racional multiplicar(Racional racional){
        return new Racional(numerador*racional.numerador,denominador*racional.denominador);
    }

    public Racional multiplicar(int valor){
        return multiplicar(new Racional(valor,1));
    }

    private int MCD(){
        int temporal; //Para no perder la b
        int a = numerador;
        int b = denominador;
        while (b!=0){
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public String toString(){
        return numerador+"/"+denominador;
    }
}
