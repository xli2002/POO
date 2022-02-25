package EjerciciosOO;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;

    private final static char sexoD = 'H';

    public static final int Delgado = -1;

    public static final int PesoIdeal = 0;

    public static final int Gordo = 1;

    public Persona(String nombre, int edad){
            this.nombre=nombre;
            this.edad=edad;
            this.dni=dni;
            this.sexo=sexo;
            this.peso=peso;
            this.altura=altura;
    }

    public int IMC (float peso, float altura){
        float imc = peso/(altura*altura);
        if (imc>= 18.5 && peso<= 25.0) {
            return PesoIdeal;
        } else if (peso < 18.6) {
            return Delgado;
        } else {
            return Gordo;
        }
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoD;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona: " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura;
    }
}
