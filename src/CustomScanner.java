import java.util.Scanner;

public class CustomScanner {
    public static Scanner scanner = new Scanner(System.in);

    public static int scanInt() {
        int scanIntValue = scanner.nextInt();
        return scanIntValue;
    }
}
