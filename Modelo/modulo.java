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
