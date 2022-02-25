package Ejercicios;

import Ejercicios.Ejer1.Cuenta;
import Ejercicios.Ejer3.Contador;
import Ejercicios.Ejer4.Libro;
import Ejercicios.Ejer6.Fecha;

public class App {
    public static void main(String[] args) {
        Fecha f = new Fecha(28,12,2020);
        f.next();
        System.out.println(f);
        f.next();
        System.out.println(f);
        f.next();
        System.out.println(f);
        f.next();
        System.out.println(f);




//        Libro l = new Libro("Hola");
//        System.out.println(l.prestar());
//        System.out.println(l.prestar());
//        System.out.println(l.devolver());

//        Cuenta c1 = new Cuenta("Carlos");
//        Cuenta c2 = new Cuenta("Markos");
//        c1.ingreso(100);
//        c2.transferencia(c2,120);
//        System.out.println(c1);
//        System.out.println(c2);
    }
}
