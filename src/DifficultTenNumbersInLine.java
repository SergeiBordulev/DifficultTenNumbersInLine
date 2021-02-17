import java.util.Scanner;

public class DifficultTenNumbersInLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial value:");
        int startNumber = scanner.nextInt();

        System.out.println("Enter the maximum value:");
        int endNumber = scanner.nextInt();

        System.out.println("Enter the number of values per line:");
        int numbersInLineQuantity = scanner.nextInt();

        int i = startNumber;
        int positionInLine = 0;

        while (i <= endNumber) {
            System.out.printf("%d\t", i);
            positionInLine++;

            if (positionInLine % numbersInLineQuantity == 0) {
                System.out.println();
            }

            i++;
        }
    }
}
