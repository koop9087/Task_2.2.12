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

    public static int findMaxIndexOfArray(int[] array, int start, int end) {
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[index] < array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void sortArrayAsc(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = findMinIndexOfArray(array, i, array.length);
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    public static void sortArrayDesc(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int maxIndex = findMaxIndexOfArray(array, i, array.length);
            int tmp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = tmp;
        }
    }

    public static void sortInAscendingOrderOfLine(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            sortArrayAsc(array[i]);
        }
    }

    public static void sortInDescendingOrderOfLine(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            sortArrayDesc(array[i]);
        }
    }
}