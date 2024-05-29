package Modelo;

public class Objetos {

    int edad;
    double estatura;
    String nombre;

    public Objetos(int edad, double estatura, String nombre) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void Caminar() {
        System.out.println("Pepito esta caminando");

    }

    public void Dormir() {
        System.out.println("Pepito esta durmiendo");
    }

    public void Comer() {
        System.out.println("Pepito esta comiendo");
    }

    @Override
    public String toString() {
        return "Objetos [edad=" + edad + ", estatura=" + estatura + ", nombre=" + nombre + "]";
    }

   


    

}
