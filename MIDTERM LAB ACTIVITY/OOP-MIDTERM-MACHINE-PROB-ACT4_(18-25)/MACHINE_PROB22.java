import java.util.Scanner;

class MACHINE_PROB22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Customer name: ");
		String customerName = scanner.nextLine();
		System.out.print("Customer ID: ");
		String customerId = scanner.nextLine();
		System.out.print("Reservation type (Room, Cottage, Table, etc.): ");
		String reservationType = scanner.nextLine();
		System.out.print("Number of days/hours reserved: ");
		double duration = scanner.nextDouble();
		System.out.print("Rate per day/hour: ");
		double rate = scanner.nextDouble();
		System.out.print("Food charges: ");
		double foodCharges = scanner.nextDouble();
		System.out.print("Service charges: ");
		double serviceCharges = scanner.nextDouble();
		System.out.print("Other charges: ");
		double otherCharges = scanner.nextDouble();
		System.out.print("Discount (%): ");
		double discountPercent = scanner.nextDouble();
		System.out.print("Down payment: ");
		double downPayment = scanner.nextDouble();

		double reservationCost = duration * rate;
		double subtotal = reservationCost + foodCharges + serviceCharges + otherCharges;
		double discountAmount = subtotal * discountPercent / 100.0;
		double totalBill = subtotal - discountAmount;
		double remainingBalance = totalBill - downPayment;

		System.out.println("\n******** RESERVATION BILLING ********");
		System.out.println("Customer Details");
		System.out.printf("  %-22s %s%n", "Name:", customerName);
		System.out.printf("  %-22s %s%n", "Customer ID:", customerId);
		System.out.println("-------------------------------------");
		System.out.println("Reservation Details");
		System.out.printf("  %-22s %s%n", "Reservation Type:", reservationType);
		System.out.printf("  %-22s %.2f%n", "Duration (Days/Hours):", duration);
		System.out.printf("  %-22s %.2f%n", "Rate:", rate);
		System.out.printf("  %-22s %.2f%n", "Reservation Cost:", reservationCost);
		System.out.println("-------------------------------------");
		System.out.println("Charges Breakdown");
		System.out.printf("  %-22s %10.2f%n", "Food Charges:", foodCharges);
		System.out.printf("  %-22s %10.2f%n", "Service Charges:", serviceCharges);
		System.out.printf("  %-22s %10.2f%n", "Other Charges:", otherCharges);
		System.out.printf("  %-22s %10.2f%n", "Subtotal:", subtotal);
		System.out.println("-------------------------------------");
		System.out.println("Payment Summary");
		System.out.printf("  %-22s %9.2f%%%n", "Discount:", discountPercent);
		System.out.printf("  %-22s %10.2f%n", "Discount Amount:", discountAmount);
		System.out.printf("  %-22s %10.2f%n", "Total Bill:", totalBill);
		System.out.printf("  %-22s %10.2f%n", "Down Payment:", downPayment);
		System.out.printf("  %-22s %10.2f%n", "Remaining Balance:", remainingBalance);
		System.out.println("*************************************");

		scanner.close();
	}
}
