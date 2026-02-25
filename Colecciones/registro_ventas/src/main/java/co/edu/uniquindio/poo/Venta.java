package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Venta {

    private LocalDate fecha;
    private Producto producto;
    private int cantidadVendida;
    private double costoTotal;

    public Venta(LocalDate fecha, Producto producto, int cantidadVendida, double costoTotal) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.costoTotal = cantidadVendida * producto.getCosto();
    }

    //----------------------//

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    //-------------------//
    
    @Override
    public String toString() {
        return producto.getCodigo() + " - " + producto.getNombre() +
                " | Cantidad: " + cantidadVendida +
                " | Total: $" + costoTotal;
    }
    
}
