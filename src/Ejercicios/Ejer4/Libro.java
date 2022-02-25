package Ejercicios.Ejer4;


public class Libro {
    private String titulo;
    private boolean disponible;

//    private String ISBN;
//    private String autor;

    public Libro(String titulo){
        this.titulo=titulo;
        disponible = true;
    }

    public boolean prestar(){
        if(disponible) {
            disponible = false;
            return true;
        }else
            return false;
    }

    public boolean devolver(){
        if(!disponible) {
            disponible = true;
            return true;
        }else
            return false;
    }

    public String getTitulo(){
        return titulo;
    }
    public boolean isDisponible(){
        return disponible;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    public String toString(){
        return "Titulo: " + titulo +"\n"+
                "Disponible: " + ((disponible)?"Si":"No");
    }

}
