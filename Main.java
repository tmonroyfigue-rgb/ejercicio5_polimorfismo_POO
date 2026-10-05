import Controlador.ControladorMision;
import Modelo.Mision;
import Vista.vistaConsola;

public class Main {
      public static void main(String[] args) {
        Mision modelo = new Mision();
        vistaConsola vista = new vistaConsola();

        ControladorMision controlador =
            new ControladorMision(modelo, vista);

        controlador.iniciar();
 }
}
