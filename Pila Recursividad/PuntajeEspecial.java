public class PuntajeEspecial {

    public static int sumarDiagonal(int[][] matriz, int indice) {

        if (indice == matriz.length) {
            return 0;
        }

        return matriz[indice][indice] + sumarDiagonal(matriz, indice + 1);
    }

    public static void main(String[] args) {

        int[][] puntajes = {
            {100, 80, 70},
            {60, 120, 90},
            {50, 75, 150}
        };

        int total = sumarDiagonal(puntajes, 0);

        System.out.println("Puntaje total en niveles especiales: " + total);
    }
}