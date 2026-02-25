public class RecorrerMatriz {

    static void recorrer(int[][] mat, int fila, int col) {
        if (fila == mat.length) {
            return;
        }

        if (col == mat[fila].length) {
            recorrer(mat, fila + 1, 0);
            return;
        }

        System.out.print(mat[fila][col] + " ");
        recorrer(mat, fila, col + 1);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        recorrer(mat, 0, 0);
    }
}