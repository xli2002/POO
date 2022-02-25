package Ejercicios.Ejer3;

public class Contador {
    private int contador;

    public Contador(int contador) {
      this.contador = contador;
    }

    public int increment(){
        return contador+1;
    }

    public int decrement(){
        return contador-1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String toString() {
        return "" + contador ;
    }
}
