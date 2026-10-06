import java.util.Arrays;
import java.util.Scanner;

public class Week_7_program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Enter 8 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] unique = Arrays.stream(numbers).distinct().toArray();
        System.out.println("Array without duplicates: " + Arrays.toString(unique));

        if (unique.length < 2) {
            System.out.println("Second largest and second smallest elements do not exist.");
        } else {
            Arrays.sort(unique);
            System.out.println("Second smallest element: " + unique[1]);
            System.out.println("Second largest element: " + unique[unique.length - 2]);
        }

        scanner.close();
    }
}