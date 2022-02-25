package Ejercicios.Ejer1;

public class Cuenta {
    private float saldo;
    private String titular;
    private String iban;
    private final String pais = "34 ";
    private final String entidad = "1234";


    public Cuenta(String titular) {
        this.saldo = 0;
        this.titular = titular;
        this.iban = pais + entidad + " " + String.valueOf((int) (Math.random() * 10000000));
    }

    public boolean ingreso(float cantidad) {
        if (cantidad < 0)
            return false;
        else
            saldo += cantidad;
        return true;
    }

    public boolean reintegro(float cantidad) {
        if (cantidad < 0 || cantidad > saldo)
            return false;
        else
            saldo -= cantidad;
        return true;
    }

    public boolean transferencia(Cuenta destino, float cantidad) {
        if (cantidad < 0 || cantidad > saldo)
            return false;
        destino.ingreso(cantidad);
        reintegro(cantidad);
        saldo -= cantidad;
        return true;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Titular: " + titular + "\n" +
                "IBAN: " + iban + "\n" +
                "Saldo: " + saldo;

    }
}
