public class ModuloEnergia extends Modulo {

    private String tipoFuente;
    private double energiaPorCiclo;

    public ModuloEnergia(int id, String nombre, double salud,
                        double costo, String tipoFuente,
                        double energiaPorCiclo) {
        super(id, nombre, salud, costo);
        this.tipoFuente = tipoFuente;
        this.energiaPorCiclo = energiaPorCiclo;
    }

    public String getTipoFuente() {
        return tipoFuente;
    }

    public double getEnergiaPorCiclo() {
        return energiaPorCiclo;
    }

    public void setTipoFuente(String tipo) {
        this.tipoFuente = tipo;
    }

    public void setEnergiaPorCiclo(double energia) {
        this.energiaPorCiclo = energia;
    }

    @Override
    public String procesarCiclo() {
        return "La fuente " + tipoFuente
            + " suministra " + energiaPorCiclo
            + " unidades de energia por ciclo.";
    }

    @Override
    public String toString() {
        return super.toString()
            + "\nTipo de modulo: Energia"
            + "\nFuente: " + tipoFuente
            + "\nEnergia suministrada por ciclo: "
            + energiaPorCiclo;
    }
}
