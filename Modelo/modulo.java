package Modelo;

public abstract class Modulo implements Comparable<Modulo> {

    private int id;
    private String nombre;
    private double salud;
    private double costoConstruccion;

    public Modulo(int id, String nombre, double salud, double costoConstruccion) {
        this.id = id;
        this.nombre = nombre;
        this.salud = salud;
        this.costoConstruccion = costoConstruccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalud() {
        return salud;
    }

    public double getCostoConstruccion() {
        return costoConstruccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public void setCostoConstruccion(double costoConstruccion) {
        this.costoConstruccion = costoConstruccion;
    }

    public abstract String procesarCiclo();

    @Override
    public int compareTo(Modulo otro) {
        return Double.compare(this.costoConstruccion, otro.costoConstruccion);
    }

    @Override
    public String toString() {
        return "ID: " + id
                + "\nNombre: " + nombre
                + "\nSalud: " + salud + "%"
                + "\nCosto de construccion: Q" + costoConstruccion;
    }
}
