import java.util.Scanner;

public class MACHINE_PROB21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Customer Name: ");
		String customerName = scanner.nextLine();
		System.out.print("Customer ID: ");
		String customerId = scanner.nextLine();
		System.out.print("Event Name: ");
		String eventName = scanner.nextLine();
		System.out.print("Ticket Type: ");
		String ticketType = scanner.nextLine();
		System.out.print("Ticket Price: ");
		double ticketPrice = scanner.nextDouble();
		System.out.print("Number of Tickets: ");
		int numberOfTickets = scanner.nextInt();
		System.out.print("Discount (%): ");
		double discountPercent = scanner.nextDouble();
		System.out.print("Amount Tendered: ");
		double amountTendered = scanner.nextDouble();

		double totalCost = ticketPrice * numberOfTickets;
		double discountAmount = totalCost * discountPercent / 100.0;
		double finalAmountDue = totalCost - discountAmount;
		double change = amountTendered - finalAmountDue;

		System.out.println("\n******** EVENT TICKET ********");
		System.out.println("------------------------------");
		System.out.println("Customer Details");
		System.out.printf("  %-20s %s%n", "Name:", customerName);
		System.out.printf("  %-20s %s%n", "Customer ID:", customerId);
		System.out.println("------------------------------");
		System.out.println("Ticket Information");
		System.out.printf("  %-20s %s%n", "Event Name:", eventName);
		System.out.printf("  %-20s %s%n", "Ticket Type:", ticketType);
		System.out.printf("  %-20s $%,.2f%n", "Ticket Price:", ticketPrice);
		System.out.printf("  %-20s %d%n", "Number of Tickets:", numberOfTickets);
		System.out.printf("  %-20s $%,.2f%n", "Total Ticket Cost:", totalCost);
		System.out.println("------------------------------");
		System.out.println("Payment Summary");
		System.out.printf("  %-20s %.2f%%%n", "Discount:", discountPercent);
		System.out.printf("  %-20s $%,.2f%n", "Discount Amount:", discountAmount);
		System.out.printf("  %-20s $%,.2f%n", "Final Amount Due:", finalAmountDue);
		System.out.printf("  %-20s $%,.2f%n", "Amount Tendered:", amountTendered);
		System.out.printf("  %-20s $%,.2f%n", "Change:", change);
		System.out.println("******************************");

		scanner.close();
	}
}
