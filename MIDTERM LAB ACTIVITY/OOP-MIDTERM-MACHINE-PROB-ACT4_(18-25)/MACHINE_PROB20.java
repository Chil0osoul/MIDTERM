import java.util.Locale;
import java.util.Scanner;

public class MACHINE_PROB20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();

        String[] itemNames = new String[3];
        int[] quantities = new int[3];
        double[] prices = new double[3];
        double[] totals = new double[3];
        double subtotal = 0.0;

        for (int i = 0; i < itemNames.length; i++) {
            System.out.printf("\nItem %d name: ", i + 1);
            itemNames[i] = scanner.nextLine();
            System.out.print("Quantity: ");
            quantities[i] = scanner.nextInt();
            System.out.print("Price per item: ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the remainder of the line.

            totals[i] = quantities[i] * prices[i];
            subtotal += totals[i];
        }

        System.out.print("\nDiscount (%): ");
        double discountPercent = scanner.nextDouble();
        System.out.print("Amount tendered: ");
        double amountTendered = scanner.nextDouble();

        double discountAmount = subtotal * discountPercent / 100.0;
        double amountDue = subtotal - discountAmount;
        double change = amountTendered - amountDue;

        System.out.println("\n******** CUSTOMER RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("Name       : " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("\nPurchased Items");
        System.out.printf("%-20s %8s %12s %12s%n", "Item Name", "Quantity", "Price", "Total");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < itemNames.length; i++) {
            System.out.printf("%-20s %8d %12.2f %12.2f%n",
                    itemNames[i], quantities[i], prices[i], totals[i]);
        }

        System.out.println("\nPayment Summary");
        System.out.printf("Subtotal          : %.2f%n", subtotal);
        System.out.printf("Discount (%%)      : %.2f%%%n", discountPercent);
        System.out.printf("Discount Amount   : %.2f%n", discountAmount);
        System.out.printf("Total Amount Due  : %.2f%n", amountDue);
        System.out.printf("Amount Tendered   : %.2f%n", amountTendered);
        System.out.printf("Change            : %.2f%n", change);
        System.out.println("**********************************");

        scanner.close();
    }
}