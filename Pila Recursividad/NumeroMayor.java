public class NumeroMayor {

    public static void main(String[] args) {
        int[] lista = {2, 6, 3, 8};
        int mayor = obtenerMayor(lista, 0, lista.length);
        System.out.println(mayor);
    }

    public static int obtenerMayor(int[] lista, int inicio, int fin) {
        if (fin - inicio == 1) {
            return lista[inicio];
        }

        int mitad = (inicio + fin) / 2;

        int mayorIzquierda = obtenerMayor(lista, inicio, mitad);
        int mayorDerecha = obtenerMayor(lista, mitad, fin);

        return Math.max(mayorIzquierda, mayorDerecha);
    }
}
