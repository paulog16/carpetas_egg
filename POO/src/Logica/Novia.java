package Logica;

public class Novia {

    String nombre;
    String apellido;
    int edad;

    public Novia() {
    }

    public Novia(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
       return nombre; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarNombre() {
        System.out.println("mi novia sabe decir su nombre");

    }

}
