package Controlador;

import Modelo.Mision;
import Modelo.modulo;
import Vista.vistaConsola;

public class ControladorMision {

    private Mision modelo;
    private vistaConsola vista;

    public ControladorMision(Mision modelo, vistaConsola vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = vista.leerEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1:
                    listarModulos();
                    break;

                case 2:
                    buscarPorId();
                    break;

                case 3:
                    buscarPorNombre();
                    break;

                case 4:
                    ordenarModulos();
                    break;

                case 5:
                    vista.mostrarMensaje(
                        "Programa finalizado. Hasta pronto."
                    );
                    break;

                default:
                    vista.mostrarMensaje(
                        "Opcion invalida. Seleccione del 1 al 5."
                    );
                    break;
            }
        } while (opcion != 5);
    }

    private void listarModulos() {
        vista.mostrarMensaje(
            "\n===== MODULOS DE LA MISION ====="
        );

        for (modulo actual : modelo.getModulos()) {
            mostrarDetalle(actual);
        }
    }

    private void buscarPorId() {
        int id = vista.leerEntero("Ingrese el ID del modulo: ");
        modulo encontrado = modelo.buscarModulo(id);

        if (encontrado == null) {
            vista.mostrarMensaje(
                "No se encontro un modulo con ese ID."
            );
        } else {
            mostrarDetalle(encontrado);
        }
    }

    private void buscarPorNombre() {
        String nombre = vista.leerTexto(
            "Ingrese el nombre completo del modulo: "
        );

        modulo encontrado = modelo.buscarModulo(nombre);

        if (encontrado == null) {
            vista.mostrarMensaje(
                "No se encontro un modulo con ese nombre."
            );
        } else {
            mostrarDetalle(encontrado);
        }
    }

    private void ordenarModulos() {
        modelo.ordenarPorCosto();

        vista.mostrarMensaje(
            "\nModulos ordenados de menor a mayor costo."
        );

        listarModulos();
    }

    private void mostrarDetalle(modulo actual) {
        vista.mostrarMensaje(
            "\n--------------------------------"
        );

        vista.mostrarMensaje(actual.toString());

        vista.mostrarMensaje(
            "Accion por ciclo: " + actual.procesarCiclo()
        );
    }
}