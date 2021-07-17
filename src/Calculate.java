public class Calculate {
    public static int findMinIndexOfArray(int[] array, int start, int end) {
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void sortArrayAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = findMinIndexOfArray(array, i, array.length);
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }


    public static void sortInAscendingOrderOfLine(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            sortArrayAsc(array[i]);
        }
    }

    public static int[] createNewMatrix(int[] array, int start, int end) {
        int[] mas = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            goingToMatrixColumn(array, start, end);
            mas[j] = array[i];
        }
        return mas;
    }

    public static void goingToMatrixColumn(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            createNewMatrix(array, start, end);
        }
    }
}