import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Week8_ClassAct2{

    public static void main(String[] args) {
        int page, date, read, due;
        String name;
        
        Scanner input = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd, yy");

        System.out.print("What is your name?: ");
        name = input.nextLine();

        System.out.print("How many pages does the book have?: ");
        page = input.nextInt();
        
        System.out.print("How many pages have you read?:  ");
        read = input.nextInt();

        System.out.println("--- Enter Issue Date ---");
        System.out.print("Month (1-12): ");
        int issueMonth = input.nextInt();
        System.out.print("Day (1-31): ");
        int issueDay = input.nextInt();
        System.out.print("Year (e.g., 2026): ");
        int issueYear = input.nextInt();
        LocalDate issueDate = LocalDate.of(issueYear, issueMonth, issueDay);
        
        System.out.println("--- Enter Due Date ---");
        System.out.print("Month (1-12): ");
        int dueMonth = input.nextInt();
        System.out.print("Day (1-31): ");
        int dueDay = input.nextInt();
        System.out.print("Year (e.g., 2026): ");
        int dueYear = input.nextInt();
        LocalDate dueDate = LocalDate.of(dueYear, dueMonth, dueDay);

        input.close();
        
/* Sample output: You have read 50% of the book.
You have 5 days remaining to return the book.
You should read 6 pages per day */

int Percentage = (int) (((double) read / page) * 100);
long Remaining = ChronoUnit.DAYS.between(issueDate, dueDate);
int Left = page - read;
int pagesPerDay = (Remaining > 0) ? (int) Math.ceil((double) Left / Remaining) : Left;
System.out.println("\nWelcome "+ name);
System.out.println("\nYou have read " + Percentage + "% of the book.");
System.out.println("You have " + Remaining + " days remaining to return the book.");
System.out.println("You still have " + Left + " pages. You should read " + pagesPerDay + " pages per day");
              
        
        
        
        
    }
}
