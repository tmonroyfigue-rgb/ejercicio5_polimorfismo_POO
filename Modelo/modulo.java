package Modelo;

public class modulo {
    private int id;
    private String nombre;
    private double salud;
    private double costoConstruccion;

    public modulo (int id, String nombre, double salud, double costoConstruccion) {
        this.id = id;
        this.nombre = nombre;
        this.salud = salud;
        this.costoConstruccion = costoConstruccion;
    }

    public int getid () {
        return id;
    }
    
    public String getnombre () {
        return nombre;
    }
    
    public double getsalud () {
        return salud;
    }

    public double getcostoConstruccion () {
        return costoConstruccion;
    }

    public void setnombre (String nombre) {
        this.nombre = nombre;
    }

    public void setsalud (double salud) {
        this.salud = salud;
    }

    public void setcostoConstruccion (double costoConstruccion) {
        this.costoConstruccion = costoConstruccion;
    }
}
public class ModuloVuelo extends Modulo {

    private String tipoInstrumento;
    private double datosPorCiclo;

    public ModuloVuelo(int id, String nombre, double salud,
                       double costo, String tipoInstrumento,
                       double datosPorCiclo) {
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

    public void setTipoInstrumento(String tipo) {
        this.tipoInstrumento = tipo;
    }

    public void setDatosPorCiclo(double datos) {
        this.datosPorCiclo = datos;
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
            + "\nInstrumento: " + tipoInstrumento
            + "\nDatos por ciclo: " + datosPorCiclo + " MB";
    }
}