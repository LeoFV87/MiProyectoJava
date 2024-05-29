import Controlador.ObjetoControlador;
import Modelo.Objetos;
import Vista.ObjetoVista;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");

        Objetos[] objetos = new Objetos [3];
        objetos[0]= new Objetos(19, 1.73, "Leo");
        objetos[1]=new Objetos(18, 1.82, "Pepe");
        objetos[2]= new Objetos(22, 1.67, "Tilin");


        ObjetoVista objetoVista = new ObjetoVista();
        objetoVista.mostrarObjeto(objetos);

        System.out.println("////////////////////////////////////////");
        ObjetoControlador objetoControlador = new ObjetoControlador();
        objetoControlador.busquedaSecuencial(objetos, 19);



    }
}