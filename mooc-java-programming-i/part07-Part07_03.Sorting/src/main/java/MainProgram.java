
public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indice = startIndex;
        int menor = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < menor) {
                indice = i;
                menor = table[i];
            }
        }
        return indice;
    }

    public static int indexOfSmallest(int[] array) {
        int indice = 0;
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                indice = i;
                menor = array[i];
            }
        }
        return indice;
    }

    public static int smallest(int[] array) {
        int chiquitito = array[0];
        for (int i : array) {
            if (i < chiquitito) {
                chiquitito = i;
            }
        }
        return chiquitito;
    }

}
