package Modelo;
public class ModuloVuelo extends modulo{
    private String tipoInstrumento;
    private double datosPorCiclo;
    
    public ModuloVuelo(int id, String nombre, double salud, double costo, String tipoInstrumento, double datosPorCiclo){
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

    public String procesarCiclo(){
        return procesarCiclo();
    }

    public String toString(){
        return toString();
    }
}