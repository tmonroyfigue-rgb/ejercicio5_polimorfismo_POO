package Modelo;

public class ModuloTierra extends Modulo {

    private double datosDescargadosPorCiclo;
    private double consumoEnergia;

    public ModuloTierra(int id, String nombre, double salud, double costo,
                        double datosDescargadosPorCiclo, double consumoEnergia) {
        super(id, nombre, salud, costo);
        this.datosDescargadosPorCiclo = datosDescargadosPorCiclo;
        this.consumoEnergia = consumoEnergia;
    }

    public double getDatosDescargadosPorCiclo() {
        return datosDescargadosPorCiclo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setDatosDescargadosPorCiclo(double datos) {
        this.datosDescargadosPorCiclo = datos;
    }

    public void setConsumoEnergia(double consumo) {
        this.consumoEnergia = consumo;
    }

    @Override
    public String procesarCiclo() {
        return "La antena descarga " + datosDescargadosPorCiclo
                + " MB de informacion y consume " + consumoEnergia
                + " unidades de energia por ciclo.";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de modulo: Tierra"
                + "\nDatos descargados por ciclo: " + datosDescargadosPorCiclo + " MB"
                + "\nConsumo de energia por ciclo: " + consumoEnergia;
    }
}
