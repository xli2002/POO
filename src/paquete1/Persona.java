package paquete1;

public class Persona {

    private String nombre;
    private float altura;
    private int edad;


    public Persona(String nombre, float altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getaltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setEda(int edad){
        this.edad = edad;
    }



    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" + "Altura: " + altura + "\n" + "Edad: " + edad;
    }

}
