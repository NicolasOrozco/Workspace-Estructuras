package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private String codigo;
    private String informacion;
    private double costo;

    public Producto(String nombre, String codigo, String informacion, double costo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.informacion = informacion;
        this.costo = costo;
    }

    //------------------------//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    //------------------------//

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", informacion=" + informacion + ", costo=" + costo
                + "]";
    }
    
}

