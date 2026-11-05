import java.util.Scanner;

public class MACHINE_PROB19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Student Name: ");
		String studentName = scanner.nextLine();
		System.out.print("Student ID: ");
		String studentId = scanner.nextLine();
		System.out.print("Course/Program: ");
		String course = scanner.nextLine();
		System.out.print("Year Level: ");
		int yearLevel = scanner.nextInt();

		System.out.print("Number of Units Enrolled: ");
		int units = scanner.nextInt();
		System.out.print("Tuition Fee per Unit: ");
		double tuitionPerUnit = scanner.nextDouble();
		System.out.print("Miscellaneous Fee: ");
		double miscellaneousFee = scanner.nextDouble();
		System.out.print("Laboratory Fee: ");
		double laboratoryFee = scanner.nextDouble();
		System.out.print("Library Fee: ");
		double libraryFee = scanner.nextDouble();
		System.out.print("Other Fees: ");
		double otherFees = scanner.nextDouble();
		System.out.print("Down Payment: ");
		double downPayment = scanner.nextDouble();
		System.out.print("Scholarship Discount (enter 0 if none): ");
		double scholarshipDiscount = scanner.nextDouble();

		double tuitionTotal = units * tuitionPerUnit;
		double additionalFees = laboratoryFee + libraryFee + otherFees;
		double grossTotal = tuitionTotal + miscellaneousFee + additionalFees;
		double netTotal = grossTotal - scholarshipDiscount;
		double balance = netTotal - downPayment;

		System.out.println("\n*** STUDENT TUITION BILLING SYSTEM ***");
		System.out.println("Student Details");
		System.out.printf("  %-25s %s%n", "Name:", studentName);
		System.out.printf("  %-25s %s%n", "Student ID:", studentId);
		System.out.printf("  %-25s %s%n", "Course:", course);
		System.out.printf("  %-25s %d%n", "Year Level:", yearLevel);

		System.out.println("\nEnrollment Summary");
		System.out.printf("  %-25s %d%n", "Units Enrolled:", units);
		System.out.printf("  %-25s %,.2f%n", "Tuition per Unit:", tuitionPerUnit);
		System.out.printf("  %-25s %,.2f%n", "Tuition Fee Total:", tuitionTotal);

		System.out.println("\nFees Breakdown");
		System.out.printf("  %-25s %,.2f%n", "Miscellaneous Fee:", miscellaneousFee);
		System.out.printf("  %-25s %,.2f%n", "Laboratory Fee:", laboratoryFee);
		System.out.printf("  %-25s %,.2f%n", "Library Fee:", libraryFee);
		System.out.printf("  %-25s %,.2f%n", "Other Fees:", otherFees);
		System.out.printf("  %-25s %,.2f%n", "Gross Total Fee:", grossTotal);

		System.out.println("\nPayment Summary");
		System.out.printf("  %-25s %,.2f%n", "Scholarship Discount:", scholarshipDiscount);
		System.out.printf("  %-25s %,.2f%n", "Net Total Fee:", netTotal);
		System.out.printf("  %-25s %,.2f%n", "Down Payment:", downPayment);
		System.out.printf("  %-25s %,.2f%n", "Remaining Balance:", balance);

		scanner.close();
	}
}
