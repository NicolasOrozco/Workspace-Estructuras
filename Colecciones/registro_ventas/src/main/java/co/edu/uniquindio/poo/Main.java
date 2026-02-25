package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Venta> mapa = seleccionarMapa();
        RegistroVentas registro = new RegistroVentas(mapa);

        cargarDatosPrueba(registro);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarVenta(registro);
                    break;

                case 2:
                    consultarVenta(registro);
                    break;

                case 3:
                    System.out.println("\nVentas registradas:");
                    registro.mostrarVentas();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);
    }

    // ---------------- SELECCIÓN DEL MAP ----------------

    private static Map<String, Venta> seleccionarMapa() {
        System.out.println("Seleccione el tipo de estructura:");
        System.out.println("1. HashMap");
        System.out.println("2. LinkedHashMap");
        System.out.println("3. TreeMap");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 2:
                System.out.println("Usando LinkedHashMap");
                return new LinkedHashMap<>();

            case 3:
                System.out.println("Usando TreeMap");
                return new TreeMap<>();

            default:
                System.out.println("Usando HashMap");
                return new HashMap<>();
        }
    }

    // ---------------- MENÚ ----------------

    private static void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Registrar venta");
        System.out.println("2. Consultar venta por código");
        System.out.println("3. Mostrar todas las ventas");
        System.out.println("4. Salir");
        System.out.print("Seleccione: ");
    }

    // ---------------- FUNCIONES ----------------

    private static void registrarVenta(RegistroVentas registro) {

        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();

        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Información: ");
        String info = scanner.nextLine();

        System.out.print("Costo: ");
        double costo = scanner.nextDouble();

        System.out.print("Cantidad vendida: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Producto producto = new Producto(nombre, codigo, info, costo);
        Venta venta = new Venta(producto, cantidad);

        registro.registrarVenta(venta);

        System.out.println("Venta registrada correctamente.");
    }

    private static void consultarVenta(RegistroVentas registro) {
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();
        registro.consultarProducto(codigo);
    }

    // ---------------- DATOS DE PRUEBA ---------------- //

    private static void cargarDatosPrueba(RegistroVentas registro) {

        Producto p1 = new Producto("Mouse", "C3", "Mouse gamer", 25);
        Producto p2 = new Producto("Teclado", "A1", "Mecánico", 40);
        Producto p3 = new Producto("Monitor", "B2", "24 pulgadas", 200);

        registro.registrarVenta(new Venta(p1, 2));
        registro.registrarVenta(new Venta(p2, 1));
        registro.registrarVenta(new Venta(p3, 1));

        System.out.println("Datos de prueba cargados.");
    }
}