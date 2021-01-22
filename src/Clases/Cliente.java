package Clases;

public class Cliente {

    //VARIABLES
    private int ci;
    private String nombre;
    private int ID;
    private String fecha;

    //CONSTRUCTOR
    public Cliente(int ci, String nombre, int ID, String fecha) {
        this.ci = ci;
        this.nombre = nombre;
        this.ID = ID;
        this.fecha = fecha;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
