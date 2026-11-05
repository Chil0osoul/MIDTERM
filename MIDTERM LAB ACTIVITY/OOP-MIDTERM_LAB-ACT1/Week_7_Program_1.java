/* Write a program that reads 10 real numbers from the user (negative and positive numbers) into an
array, then it will do the following:
- find the sum and average of positive numbers of the array and display them.
- count negative numbers of the array and display it.
- find the minimum value of the array and display it.
Use a separate loop for each one of the tasks shown above.*/ 

import java.util.Scanner;

public class Week_7_Program_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        // Read 10 real numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Task 1: Find the sum and average of positive numbers
        double sumPositive = 0;
        int countPositive = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > 0) {
                sumPositive += numbers[i];
                countPositive++;
            }
        }
        double averagePositive = (countPositive > 0) ? sumPositive / countPositive : 0;
        System.out.println("Sum of positive numbers: " + sumPositive);
        System.out.println("Average of positive numbers: " + averagePositive);

        // Task 2: Count negative numbers
        int countNegative = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < 0) {
                countNegative++;
            }
        }
        System.out.println("Count of negative numbers: " + countNegative);

        // Task 3: Find the minimum value
        double min = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
    }
}













