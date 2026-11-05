import java.util.Locale;
import java.util.Scanner;

public class MACHINE_PROB25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("=== Flower Reservation and Billing System ===");
        String customerName = readText(input, "Customer name: ");
        String customerId = readText(input, "Customer ID: ");
        String contactNumber = readText(input, "Contact number: ");
        String flowerType = readText(input, "Flower type: ");
        String arrangementType = readText(input, "Arrangement type: ");
        double price = readNonNegative(input, "Price per arrangement: ");
        int quantity = readPositiveInt(input, "Quantity: ");
        String reservationDate = readText(input, "Reservation date (YYYY-MM-DD): ");
        String pickupDate = readText(input, "Pickup/Delivery date (YYYY-MM-DD): ");
        double deliveryFee = readNonNegative(input, "Delivery fee: ");
        double customizationFee = readNonNegative(input, "Customization fee: ");
        double otherCharges = readNonNegative(input, "Other charges: ");
        double discountPercent;
        do {
            discountPercent = readNonNegative(input, "Discount (%): ");
            if (discountPercent > 100) {
                System.out.println("Discount cannot exceed 100%.");
            }
        } while (discountPercent > 100);
        double downPayment = readNonNegative(input, "Down payment: ");

        double reservationCost = price * quantity;
        double subtotal = reservationCost + deliveryFee + customizationFee + otherCharges;
        double discountAmount = subtotal * discountPercent / 100.0;
        double totalBill = subtotal - discountAmount;
        double remainingBalance = totalBill - downPayment;

        System.out.println("\n******** FLOWER RESERVATION RECEIPT ********");
        System.out.println("--------------------------------------------");
        System.out.println("CUSTOMER DETAILS");
        printText("Name:", customerName);
        printText("Customer ID:", customerId);
        printText("Contact Number:", contactNumber);
        System.out.println("--------------------------------------------");
        System.out.println("RESERVATION SUMMARY");
        printText("Flower Type:", flowerType);
        printText("Arrangement Type:", arrangementType);
        System.out.printf("%-27s %d%n", "Quantity:", quantity);
        printMoney("Price per Arrangement:", price);
        printMoney("Reservation Cost:", reservationCost);
        printText("Reservation Date:", reservationDate);
        printText("Pickup/Delivery Date:", pickupDate);
        System.out.println("--------------------------------------------");
        System.out.println("CHARGES BREAKDOWN");
        printMoney("Delivery Fee:", deliveryFee);
        printMoney("Customization Fee:", customizationFee);
        printMoney("Other Charges:", otherCharges);
        printMoney("Subtotal:", subtotal);
        System.out.println("--------------------------------------------");
        System.out.println("PAYMENT SUMMARY");
        System.out.printf("%-27s %.2f%%%n", "Discount:", discountPercent);
        printMoney("Discount Amount:", discountAmount);
        printMoney("Total Bill:", totalBill);
        printMoney("Down Payment:", downPayment);
        printMoney("Remaining Balance:", remainingBalance);
        System.out.println("********************************************");
        input.close();
    }

    private static String readText(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    private static double readNonNegative(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                double value = input.nextDouble();
                input.nextLine();
                if (Double.isFinite(value) && value >= 0) return value;
            } else {
                input.nextLine();
            }
            System.out.println("Enter a valid non-negative number.");
        }
    }

    private static int readPositiveInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                int value = input.nextInt();
                input.nextLine();
                if (value > 0) return value;
            } else {
                input.nextLine();
            }
            System.out.println("Enter a positive whole number.");
        }
    }

    private static void printText(String label, String value) {
        System.out.printf("%-27s %s%n", label, value);
    }

    private static void printMoney(String label, double value) {
        System.out.printf("%-27s %.2f%n", label, value);
    }
}