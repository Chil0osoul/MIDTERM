import java.util.Scanner;

public class WEEK_7_ASSIGNMENT_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.println(number % 2 == 0 ? "Even" : "Odd");
	}
}
