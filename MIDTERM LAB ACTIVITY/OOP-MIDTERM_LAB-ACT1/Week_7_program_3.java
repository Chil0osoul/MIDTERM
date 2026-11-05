import java.util.Scanner;

public class Week_7_program_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] data = new int[5];

		System.out.print("Enter Data in Array: ");
		for (int i = 0; i < data.length; i++) {
			data[i] = input.nextInt();
		}

		System.out.print("Stored Data in Array: ");
		printArray(data, data.length);

		System.out.print("Enter poss. of Element to Delete: ");
		int position = input.nextInt();

		if (position < 1 || position > data.length) {
			System.out.println("Invalid position.");
		} else {
			for (int i = position - 1; i < data.length - 1; i++) {
				data[i] = data[i + 1];
			}

			System.out.print("New data in Array: ");
			printArray(data, data.length - 1);
		}

		input.close();
	}

	private static void printArray(int[] data, int length) {
		for (int i = 0; i < length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(data[i]);
		}
		System.out.println();
	}
}
