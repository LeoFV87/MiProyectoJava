package Vista;
import Modelo.Objetos;

    public class ObjetoVista {

        public void mostrarObjeto(Objetos[] objetos) {
            System.out.println("Información del objeto:");
            for (Objetos x : objetos) {
                System.out.println(x.toString());
        }
    }

}


    

