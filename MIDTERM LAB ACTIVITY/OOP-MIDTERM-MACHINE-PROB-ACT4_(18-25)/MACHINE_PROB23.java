import java.util.Locale;
import java.util.Scanner;

public class MACHINE_PROB23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== Car Rental System ===");
        String customerName = readText(scanner, "Customer Name: ");
        String customerId = readText(scanner, "Customer ID: ");
        String licenseNumber = readText(scanner, "Driver's License Number: ");

        String vehicleType = readText(scanner, "Vehicle Type: ");
        String vehicleModel = readText(scanner, "Vehicle Model: ");
        double ratePerDay = readDouble(scanner, "Rental Rate per Day: ");
        int rentalDays = readInt(scanner, "Number of Rental Days: ");
        String pickupDate = readText(scanner, "Pickup Date (YYYY-MM-DD): ");
        String returnDate = readText(scanner, "Return Date (YYYY-MM-DD): ");

        double insuranceFee = readDouble(scanner, "Insurance Fee: ");
        double fuelCharge = readDouble(scanner, "Fuel Charge: ");
        double otherCharges = readDouble(scanner, "Other Charges: ");
        double discountPercent = readDouble(scanner, "Discount (%): ");
        double amountPaid = readDouble(scanner, "Amount Paid: ");

        double rentalCost = ratePerDay * rentalDays;
        double subtotal = rentalCost + insuranceFee + fuelCharge + otherCharges;
        double discountAmount = subtotal * discountPercent / 100.0;
        double totalDue = subtotal - discountAmount;
        boolean fullyPaid = amountPaid >= totalDue;
        double balance = fullyPaid ? amountPaid - totalDue : totalDue - amountPaid;

        System.out.println("\n******** CAR RENTAL RECEIPT ********");
        System.out.println("------------------------------------");
        System.out.println("CUSTOMER DETAILS");
        System.out.printf("%-24s %s%n", "Name:", customerName);
        System.out.printf("%-24s %s%n", "Customer ID:", customerId);
        System.out.printf("%-24s %s%n", "Driver's License:", licenseNumber);

        System.out.println("\nVEHICLE INFORMATION");
        System.out.printf("%-24s %s%n", "Vehicle Type:", vehicleType);
        System.out.printf("%-24s %s%n", "Vehicle Model:", vehicleModel);
        System.out.printf("%-24s %,.2f%n", "Rate per Day:", ratePerDay);

        System.out.println("\nRENTAL SUMMARY");
        System.out.printf("%-24s %s%n", "Pickup Date:", pickupDate);
        System.out.printf("%-24s %s%n", "Return Date:", returnDate);
        System.out.printf("%-24s %d%n", "Number of Days:", rentalDays);
        System.out.printf("%-24s %,.2f%n", "Rental Cost:", rentalCost);

        System.out.println("\nCHARGES BREAKDOWN");
        System.out.printf("%-24s %,.2f%n", "Insurance Fee:", insuranceFee);
        System.out.printf("%-24s %,.2f%n", "Fuel Charge:", fuelCharge);
        System.out.printf("%-24s %,.2f%n", "Other Charges:", otherCharges);
        System.out.printf("%-24s %,.2f%n", "Subtotal:", subtotal);

        System.out.println("\nPAYMENT SUMMARY");
        System.out.printf("%-24s %.2f%%%n", "Discount:", discountPercent);
        System.out.printf("%-24s %,.2f%n", "Discount Amount:", discountAmount);
        System.out.printf("%-24s %,.2f%n", "Total Amount Due:", totalDue);
        System.out.printf("%-24s %,.2f%n", "Amount Paid:", amountPaid);
        System.out.printf("%-24s %,.2f%n", fullyPaid ? "Change:" : "Remaining Balance:", balance);
        System.out.println("------------------------------------");
        System.out.println("Thank you for choosing our service!");

        scanner.close();
    }

    private static String readText(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static double readDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(scanner.nextLine().trim());
    }

    private static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine().trim());
    }
}