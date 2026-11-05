import java.util.Scanner;

class OOP_MIDTERM_Lab_Act_6_Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Enter your balance: ");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n------------------------------------------------");
            System.out.println("Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");
            System.out.println("------------------------------------------------");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nHow much amount you want to withdraw from your account?");
                    System.out.print("Amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Your new balance is: " + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 2:
                    System.out.println("\nHow much amount you want to deposit in your account?");
                    System.out.print("Amount: ");
                    double deposit = sc.nextDouble();

                    balance += deposit;
                    System.out.println("Your new balance is: " + balance);
                    break;

                case 3:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}