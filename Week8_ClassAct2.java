import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Week8_ClassAct2{

    public static void main(String[] args) {
        int page, date, read, due;
        String name = "";
        
        Scanner input = new Scanner(System.in);


while (true) {
            System.out.print("Enter your name: ");
            name = input.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }

        System.out.print("How many pages does the book have?: ");
        page = input.nextInt();
        
        while (true) {
        System.out.print("How many pages have you read?:  ");
        read = input.nextInt();    
        if (page >= read){
            break;
        }else {
            System.out.println("Invalid input! Please try again.");
        }
        }

        while (true) {
        System.out.println("--- Enter Issue Date ---");
        System.out.print("Month (1-12): ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid month (1-12).");
            input.next(); 
            continue;
        }
        int issueMonth = input.nextInt();
        System.out.print("Day (1-31): ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid day (1-31).");
            input.next();
            continue;
        }
        int issueDay = input.nextInt();
        System.out.print("Year (e.g., 2026): ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid year.");
            input.next(); 
            continue;
        }
        int issueYear = input.nextInt();
        LocalDate Date = LocalDate.of(issueYear, issueMonth, issueDay);
        
        System.out.println("--- Enter Due Date ---");
        
        System.out.print("Month (1-12): ");
        int dueMonth = input.nextInt();
        if (dueMonth < 1 || dueMonth > 12) {
            System.out.println("Invalid input! Please enter a valid month (1-12).");
            continue;
        }

        System.out.print("Day (1-31): ");
        int dueDay = input.nextInt();
        if (dueDay < 1 || dueDay > 31) {
            System.out.println("Invalid input! Please enter a valid day (1-31).");
            continue;
        }

        System.out.print("Year (e.g., 2026): ");
        int dueYear = input.nextInt();
        if (dueYear < 1) {
            System.out.println("Invalid input! Please enter a valid year.");
            continue;
        }

        LocalDate dueDate = LocalDate.of(dueYear, dueMonth, dueDay);
    
        input.close();
        
/* Sample output: You have read 50% of the book.
You have 5 days remaining to return the book.
You should read 6 pages per day */

int Percentage = (int) (((double) read / page) * 100);
long Remaining = ChronoUnit.DAYS.between(Date, dueDate);
int Left = page - read;
int pagesPerDay = (Remaining > 0) ? (int) Math.ceil((double) Left / Remaining) : Left;
System.out.println("\nWelcome "+ name);
System.out.println("\nYou have read " + Percentage + "% of the book.");
System.out.println("You have " + Remaining + " days remaining to return the book.");
System.out.println("You still have " + Left + " pages. You should read " + pagesPerDay + " pages per day.");
              
        

        
     }
    }
}
