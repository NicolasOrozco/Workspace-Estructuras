public class RecorrerArreglo {

    static void recorrer(int[] arr, int i) {

        if (i == arr.length) {
            return;
        }

        System.out.println(arr[i]);
        recorrer(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        recorrer(arr, 0);
    }
}

