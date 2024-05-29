package Controlador;
import Modelo.Objetos;

public class ObjetoControlador {

    //BUSQUEDA SECUENCIAL

    public void busquedaSecuencial(Objetos[] objetos, int edad) {
        for (Objetos objeto : objetos) {
            if (objeto.getEdad() == edad) {
                System.out.println("Se ha encontrado: " + objeto);
                return;
            }
        }

        System.out.println("No se encontró ningún objeto con la edad " + edad + ".");
        
    }

}