package co.edu.uniquindio.poo;

import java.util.Map;

public class RegistroVentas {

    private Map<String, Venta> ventas;

    public RegistroVentas(Map<String, Venta> mapa) {
        this.ventas = mapa;
    }

    public void registrarVenta(Venta venta) {
        ventas.put(venta.getProducto().getCodigo(), venta);
    }

    public void consultarProducto(String codigo) {
        System.out.println(ventas.get(codigo));
    }

    public void mostrarVentas() {
        for (Venta venta : ventas.values()) {
            System.out.println(venta);
        }
    }
}