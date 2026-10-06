package Modelo;

public class ModuloVuelo extends Modulo {

    private String tipoInstrumento;
    private double datosPorCiclo;

    public ModuloVuelo(int id, String nombre, double salud, double costo,
                       String tipoInstrumento, double datosPorCiclo) {
        super(id, nombre, salud, costo);
        this.tipoInstrumento = tipoInstrumento;
        this.datosPorCiclo = datosPorCiclo;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public double getDatosPorCiclo() {
        return datosPorCiclo;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public void setDatosPorCiclo(double datosPorCiclo) {
        this.datosPorCiclo = datosPorCiclo;
    }

    @Override
    public String procesarCiclo() {
        return "El instrumento " + tipoInstrumento
                + " recolecta " + datosPorCiclo
                + " MB de datos cientificos por ciclo.";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de modulo: Vuelo"
                + "\nTipo de instrumento: " + tipoInstrumento
                + "\nDatos recolectados por ciclo: " + datosPorCiclo + " MB";
    }
}
