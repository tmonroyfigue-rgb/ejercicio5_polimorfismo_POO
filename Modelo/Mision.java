package Modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Mision {

    private ArrayList<Modulo> modulos;

    public Mision() {
        modulos = new ArrayList<Modulo>();
        cargarDatosIniciales();
    }

    public void cargarDatosIniciales() {
        modulos.clear();

        agregarModulo(new ModuloVuelo(1, "Camara principal", 100, 1500,
                "Camara optica", 25));
        agregarModulo(new ModuloVuelo(2, "Sensor termico", 90, 900,
                "Sensor de temperatura", 10));
        agregarModulo(new ModuloVuelo(3, "Camara secundaria", 85, 1200,
                "Camara infrarroja", 20));
        agregarModulo(new ModuloVuelo(4, "Sensor de radiacion", 95, 1100,
                "Detector de radiacion", 15));

        agregarModulo(new ModuloTierra(5, "Antena central", 100, 2000,
                50, 20));
        agregarModulo(new ModuloTierra(6, "Antena auxiliar", 80, 1300,
                30, 12));
        agregarModulo(new ModuloTierra(7, "Antena de respaldo", 90, 1000,
                20, 8));

        agregarModulo(new ModuloEnergia(8, "Panel solar izquierdo", 100, 800,
                "Panel solar", 40));
        agregarModulo(new ModuloEnergia(9, "Panel solar derecho", 95, 800,
                "Panel solar", 40));
        agregarModulo(new ModuloEnergia(10, "Bateria de emergencia", 85, 600,
                "Bateria", 25));
    }

    public void agregarModulo(Modulo nuevoModulo) {
        if (nuevoModulo != null && buscarModulo(nuevoModulo.getId()) == null) {
            modulos.add(nuevoModulo);
        }
    }

    public ArrayList<Modulo> getModulos() {
        return new ArrayList<Modulo>(modulos);
    }

    public Modulo buscarModulo(int id) {
        for (Modulo modulo : modulos) {
            if (modulo.getId() == id) {
                return modulo;
            }
        }
        return null;
    }

    public Modulo buscarModulo(String nombre) {
        if (nombre == null) {
            return null;
        }

        for (Modulo modulo : modulos) {
            if (modulo.getNombre().equalsIgnoreCase(nombre.trim())) {
                return modulo;
            }
        }
        return null;
    }

    public void ordenarPorCosto() {
        Collections.sort(modulos);
    }
}
