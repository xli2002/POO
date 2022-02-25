package Ejercicios.Ejer2;

import Ejercicios.Ejer1.Cuenta;

public class TarjetaCredito {

    private Cuenta cuenta;
    private float saldo;
    private float limite;

    public TarjetaCredito(Cuenta cuenta, float limite) {
        this.cuenta = cuenta;
        this.limite = limite;
        this.saldo = limite;
    }

    public boolean pagoCredito(float cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        }
        return true;
    }

    public boolean pagoDebito(float limite){
        return cuenta.reintegro(saldo);
    }


    public String toString() {
        return "Titular: " + cuenta.getTitular() + "\n" +
                "Limite: " + limite + "\n" +
                "Saldo: " + saldo;

    }
}
