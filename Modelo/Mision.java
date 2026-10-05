package Modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Mision {

    private ArrayList<modulo> modulos;

    public Mision() {
        modulos = new ArrayList<>();
        cargarDatosIniciales();
    }

    public void cargarDatosIniciales() {
        modulos.clear();

        agregarModulo(new ModuloVuelo(
            1, "Camara principal", 100, 1500,
            "Camara optica", 25
        ));

        agregarModulo(new ModuloVuelo(
            2, "Sensor termico", 90, 900,
            "Sensor de temperatura", 10
        ));

        agregarModulo(new ModuloVuelo(
            3, "Camara secundaria", 85, 1200,
            "Camara infrarroja", 20
        ));

        agregarModulo(new ModuloVuelo(
            4, "Sensor de radiacion", 95, 1100,
            "Detector de radiacion", 15
        ));

        agregarModulo(new ModuloTierra(
            5, "Antena central", 100, 2000,
            50, 20
        ));

        agregarModulo(new ModuloTierra(
            6, "Antena auxiliar", 80, 1300,
            30, 12
        ));

        agregarModulo(new ModuloTierra(
            7, "Antena de respaldo", 90, 1000,
            20, 8
        ));

        agregarModulo(new ModuloEnergia(
            8, "Panel solar izquierdo", 100, 800,
            "Panel solar", 40
        ));

        agregarModulo(new ModuloEnergia(
            9, "Panel solar derecho", 95, 800,
            "Panel solar", 40
        ));

        agregarModulo(new ModuloEnergia(
            10, "Bateria de emergencia", 85, 600,
            "Bateria", 25
        ));
    }

    public void agregarModulo(modulo nuevoModulo) {
        if (nuevoModulo == null) {
            throw new IllegalArgumentException(
                "El modulo no puede ser null."
            );
        }

        if (buscarModulo(nuevoModulo.getid()) != null) {
            throw new IllegalArgumentException(
                "Ya existe un modulo con ese ID."
            );
        }

        modulos.add(nuevoModulo);
    }

    public ArrayList<modulo> getModulos() {
        return new ArrayList<>(modulos);
    }

    public modulo buscarModulo(int id) {
        for (modulo actual : modulos) {
            if (actual.getid() == id) {
                return actual;
            }
        }

        return null;
    }

    public modulo buscarModulo(String nombre) {
        if (nombre == null) {
            return null;
        }

        for (modulo actual : modulos) {
            if (actual.getnombre().equalsIgnoreCase(nombre.trim())) {
                return actual;
            }
        }

        return null;
    }

    public void ordenarPorCosto() {
        Collections.sort(modulos);
    }
}
