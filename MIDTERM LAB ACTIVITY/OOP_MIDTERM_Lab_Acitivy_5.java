// OOP-MIDTERM_Lab_Acitivy_5

import java.util.Scanner;
abstract class Account {
    private String accountNumber;
    private double balance;
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public boolean withdraw(double amount) {
        double fee = calculateWithdrawalFee();
        double totalDeduction = amount + fee;
        
        if (amount > 0 && balance >= totalDeduction) {
            balance -= totalDeduction;
            return true;
        }
        return false;
    }

    public abstract double calculateWithdrawalFee();
    public abstract String getAccountType();
}
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public double calculateWithdrawalFee() {
        return 0.0;
    }
    @Override
    public String getAccountType() {
        return "Savings";
    }
}
class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public double calculateWithdrawalFee() {
        return 10.0; 
    }
    @Override
    public String getAccountType() {
        return "Checking";
    }
}
public class OOP_MIDTERM_Lab_Acitivy_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the OOP Banking System");
        System.out.print("Opening balance: ");
        double openingBalance = readNonNegativeBalance();
        SavingsAccount savingsAccount = new SavingsAccount("SA-101", openingBalance);
        CheckingAccount checkingAccount = new CheckingAccount("CA-202", openingBalance);
        Account selectedAccount = savingsAccount;
        printCurrentAccount(selectedAccount);
        boolean running = true;
        while (running) {
            showMenu();
            System.out.print("Choice: ");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.print("Amount to withdraw: ");
                    double withdrawAmount = readPositiveAmount();
                    double fee = selectedAccount.calculateWithdrawalFee();
                    if (selectedAccount.withdraw(withdrawAmount)) {
                        System.out.printf("Withdrawal fee: ₱%.2f | New %s balance: ₱%.2f%n",
                                fee, selectedAccount.getAccountType(), selectedAccount.getBalance());
                    } else {
                        System.out.println("Error: Insufficient balance to cover the withdrawal amount and its fee.");
                    }
                    break;
                case "2":
                    System.out.print("Amount to deposit: ");
                    double depositAmount = readPositiveAmount();
                    selectedAccount.deposit(depositAmount);
                    System.out.printf("New %s balance: ₱%.2f%n",
                            selectedAccount.getAccountType(), selectedAccount.getBalance());
                    break;
                case "3":
                    printCurrentAccount(selectedAccount);
                    break;
                case "4":
                    if (selectedAccount == savingsAccount) {
                        selectedAccount = checkingAccount;
                    } else {
                        selectedAccount = savingsAccount;
                    }
                    printCurrentAccount(selectedAccount);
                    break;
                case "5":
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid menu choice. Please select 1-5.");
                    break;
            }
            System.out.println();
        }
    }
    public static void showMenu() {
        System.out.println("1 Withdraw 2 Deposit 3 Show balance 4 Switch account 5 Exit");
    }
    
    public static double readNonNegativeBalance() {
        while (true) {
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                if (val >= 0) {
                    return val;
                }
            } else {
                scanner.next();
            }
            System.out.print("Invalid input. Enter an opening balance of 0 or more: ₱");
        }
    }
    
    public static double readPositiveAmount() {
        while (true) {
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                if (val > 0) {
                    return val;
                }
            } else {
                scanner.next();
            }
            System.out.print("Invalid input. Enter a positive transaction amount: ₱");
        }
    }
    
    public static void printCurrentAccount(Account account) {
        System.out.printf("Current account: %s | Balance: ₱%.2f%n",
                account.getAccountType(), account.getBalance());
    }
}
