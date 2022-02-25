package ruleta;

public class Jugador {
    private String nombre;
    private Revolver revolver;
    private boolean alive;

    public Jugador(){
       this.nombre = "Desconocido";
       alive = true;
       revolver = new Revolver();
    }
    public Jugador(String nombre){
        this.nombre = nombre;
        alive = true;
        revolver = new Revolver();
        revolver.introducirBala();
    }

    public Jugador(String nombre, Revolver revolver){
        this.nombre = nombre;
        alive = true;
        this.revolver = revolver;
    }

    public void rotar(){
        revolver.rotar();
    }
    public void disparar(){
        if (alive)
        alive = !revolver.dispara();
    }
    public String getNombre(){
        return nombre;
    }

    public boolean isAlive(){
        return alive;
    }

    public String toString(){
        String output= "Nombre: " + nombre +"\n";
        output += "IsAlive: " + isAlive() + "\n";
        output += "Revolver: \n" + revolver;
        return output;
    }



}
