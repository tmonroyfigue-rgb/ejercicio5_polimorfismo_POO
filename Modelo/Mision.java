import java.util.ArrayList;
import java.util.Collections;

public class Mision {

    private ArrayList<Modulo> modulos;

    public Mision() {
        modulos = new ArrayList<>();
        cargarDatosIniciales();
    }

    public void cargarDatosIniciales() {
        // Evita duplicar los datos si se vuelve a cargar la mision.
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

    // El parametro acepta objetos de cualquiera de las clases hijas.
    public void agregarModulo(Modulo modulo) {
        if (modulo == null) {
            throw new IllegalArgumentException(
                "El modulo no puede ser null."
            );
        }

        if (buscarModulo(modulo.getId()) != null) {
            throw new IllegalArgumentException(
                "Ya existe un modulo con ese ID."
            );
        }

        modulos.add(modulo);
    }

    public ArrayList<Modulo> getModulos() {
        // Devuelve una copia para proteger la estructura de la lista.
        return new ArrayList<>(modulos);
    }

    public Modulo buscarModulo(int id) {
        for (Modulo modulo : modulos) {
            if (modulo.getId() == id) {
                return modulo;
            }
        }

        return null;
    }

    // Sobrecarga: mismo nombre, distinto tipo de parametro.
    // Devuelve la primera coincidencia exacta, ignorando mayusculas.
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
        // Utiliza el compareTo definido en Modulo.
        Collections.sort(modulos);
    }
}
