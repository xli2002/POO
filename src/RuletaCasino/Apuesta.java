package RuletaCasino;

public class Apuesta {
    private float valor;
    private RuletaColor color;
    private int numero;
    private Paridad paridad;

    public Apuesta(RuletaColor color, float valor){
        this.color = color;
        this.valor = valor;
    }
    public Apuesta(Paridad paridad, float valor){
        this.paridad = paridad;
        this.valor = valor;
    }
    public Apuesta(Integer numero, float valor){
        this.numero = numero;
        this.valor = valor;
    }

//    public Float obtenerGanacias(Number number){
//        if (number.getNumero()==0) return 0f;
//        return gananciasColor(number)+gananciasNumero(number);
//    }

    private Float gananciasParidad(Number number){
        if (this.paridad==null) return 0f;
        if (number.getNumero()%2==0 && paridad==Paridad.PAR){
            return this.valor * 2;
        }else if (number.getNumero()%2 == 1 && paridad==Paridad.IMPAR){
            return this.valor*2;
        }
        return 0f;
    }

//    private Float gananciasNumero(Number number){
//        if (this.numero==null) return 0f;
//        return (number.getNumero()==this.numero)?valor*30:0f;
//    }

    private Float gananciasColor(Number number){
        if (this.color==null) return 0f;
        return (number.getNumero()==this.numero)?valor*2:0f;
    }

    @Override
    public String toString() {
        return "Apuesta: " + "\n"+
                "valor=" + valor +"\n"+
                "color=" + color.name() + "\n"+
                "numero=" + numero +"\n"+
                "paridad=" + paridad;
    }
}
