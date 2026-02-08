public class PromedioCurso {

    public static int sumarNotas(int[][] notas, int fila, int columna) {

        if (fila == notas.length) {
            return 0;
        }
        if (columna == notas[fila].length) {
            return sumarNotas(notas, fila + 1, 0);
        }

        return notas[fila][columna] + sumarNotas(notas, fila, columna + 1);
    }

    public static void main(String[] args) {

        int[][] notas = {
            {80, 75, 90},   // Estudiante 1
            {60, 85, 70},   // Estudiante 2
            {95, 88, 92}    // Estudiante 3
        };

        int totalNotas = sumarNotas(notas, 0, 0);
        int cantidadNotas = notas.length * notas[0].length;

        double promedio = (double) totalNotas / cantidadNotas;

        System.out.println("Promedio general del curso: " + promedio);
    }
}
