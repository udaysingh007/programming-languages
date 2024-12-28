import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers); // Sort in ascending order

        System.out.println("Sorted numbers in descending order:");
        for (int i = numbers.length - 1; i >= 0; i--) { // Print in reverse
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}

