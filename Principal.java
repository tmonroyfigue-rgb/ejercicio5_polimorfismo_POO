import Controlador.ControladorMision;
import Modelo.Mision;
import Vista.VistaConsola;

public class Principal {

    public static void main(String[] args) {
        Mision modelo = new Mision();
        VistaConsola vista = new VistaConsola();
        ControladorMision controlador = new ControladorMision(modelo, vista);

        controlador.iniciar();
    }
}
