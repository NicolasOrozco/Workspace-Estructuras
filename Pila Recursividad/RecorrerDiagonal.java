public class RecorrerDiagonal {

    static void recorrerDiagonal(int[][] mat, int i) {
        if (i == mat.length || i == mat[0].length) {
            return;
        }

        System.out.println(mat[i][i]);
        recorrerDiagonal(mat, i + 1);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        recorrerDiagonal(mat, 0);
    }
}