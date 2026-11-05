
import java.util.Locale;
import java.util.Scanner;

public class MACHINE_PROB24 {
    private static class MenuItem {
        String name;
        int quantity;
        double price;

        MenuItem(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        double getTotal() {
            return quantity * price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Customer name: ");
        String customerName = scanner.nextLine();

        String orderType;
        while (true) {
            System.out.print("Order type (Dine-In or Takeout): ");
            orderType = scanner.nextLine().trim();
            if (orderType.equalsIgnoreCase("Dine-In")
                    || orderType.equalsIgnoreCase("Takeout")) {
                break;
            }
            System.out.println("Please enter Dine-In or Takeout.");
        }
        boolean dineIn = orderType.equalsIgnoreCase("Dine-In");
        orderType = dineIn ? "Dine-In" : "Takeout";

        MenuItem[] items = new MenuItem[3];
        for (int i = 0; i < items.length; i++) {
            System.out.printf("\nItem %d name: ", i + 1);
            String name = scanner.nextLine();
            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Price per item: ");
            double price = Double.parseDouble(scanner.nextLine());
            items[i] = new MenuItem(name, quantity, price);
        }

        System.out.print("Service charge (0 for Takeout): ");
        double serviceCharge = Double.parseDouble(scanner.nextLine());
        System.out.print("Packaging fee (0 for Dine-In): ");
        double packagingFee = Double.parseDouble(scanner.nextLine());
        System.out.print("Discount percentage: ");
        double discountPercent = Double.parseDouble(scanner.nextLine());
        System.out.print("Amount tendered: ");
        double amountTendered = Double.parseDouble(scanner.nextLine());

        double subtotal = 0;
        for (MenuItem item : items) {
            subtotal += item.getTotal();
        }
        String chargeLabel = dineIn ? "Service Charge" : "Packaging Fee";
        double charge = dineIn ? serviceCharge : packagingFee;
        double beforeDiscount = subtotal + charge;
        double discountAmount = beforeDiscount * discountPercent / 100.0;
        double amountDue = beforeDiscount - discountAmount;
        double change = amountTendered - amountDue;

        System.out.println("\n******** RESTAURANT RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("------------------------------------");
        System.out.println("Name      : " + customerName);
        System.out.println("Order Type: " + orderType);
        System.out.println("\nOrder Summary");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-25s %8s %12s %12s%n", "Item Name", "Quantity", "Price", "Total");
        System.out.println("---------------------------------------------------------------");
        for (MenuItem item : items) {
            System.out.printf(Locale.US, "%-25s %8d %12.2f %12.2f%n",
                    item.name, item.quantity, item.price, item.getTotal());
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Billing Summary");
        System.out.println("------------------------------------");
        System.out.printf(Locale.US, "Subtotal:                %12.2f%n", subtotal);
        System.out.printf(Locale.US, "%-25s %12.2f%n", chargeLabel + ":", charge);
        System.out.printf(Locale.US, "Total Before Discount:   %12.2f%n", beforeDiscount);
        System.out.printf(Locale.US, "Discount (%.2f%%):       %12.2f%n", discountPercent, discountAmount);
        System.out.printf(Locale.US, "Total Amount Due:        %12.2f%n", amountDue);
        System.out.printf(Locale.US, "Amount Tendered:         %12.2f%n", amountTendered);
        System.out.printf(Locale.US, "Change:                  %12.2f%n", change);
        System.out.println("************************************");

        scanner.close();
    }
}