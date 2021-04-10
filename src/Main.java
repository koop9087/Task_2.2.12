public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        int[][] array = new int[size][size];
        Filler.fill(array);
        Printer.printIntMatrix(array);
        System.out.println();
        Calculate.sortInAscendingOrderOfLine(array);
        Printer.printIntMatrix(array);
        System.out.println();
        Calculate.sortInDescendingOrderOfLine(array);
        Printer.printIntMatrix(array);
    }
}
