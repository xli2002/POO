package ruleta;

public class Revolver {
    private Tambor tambor;

    public Revolver(){
        tambor = new Tambor();
    }

    public void introducirBala(){
        tambor.introducirBala((int)(Math.random()*tambor.getCamaras()));
    }

    public void rotar(){
        tambor.rotar();
    }
    public boolean dispara(){
        return tambor.disparar();
    }

    public String toString(){
        return tambor.toString();
    }
}
