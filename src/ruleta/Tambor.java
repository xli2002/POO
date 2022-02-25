package ruleta;

public class Tambor {

    private int[] tambor;
    private int pos;

    public Tambor(int size) {
        tambor = new int[size];
        pos = 0;
    }
    public Tambor() {
        tambor = new int[6];
        pos = 0;
    }

    public void introducirBala(int pos) {
        if (pos >= 0 && pos <= tambor.length -1)
            tambor[pos] = 1;
    }

    private void girar(){
        pos++;
        if (pos==6)
            pos=0;
    }

    public void rotar(){
        pos = (int)(Math.random()*6);
    }

    public int getCamaras(){
        return tambor.length;
    }

    public boolean disparar(){
        boolean pum = false;
        if (pos>=0 && pos<= tambor.length-1)
            pum = tambor[pos]==1;
        else
            pum = false;

        girar();
        return pum;
    }

    public String toString(){
        String output="Disparo: " + this.pos+"\n";
        for (int camara : tambor)
            output+= camara + " ";
        return output;
    }
}
