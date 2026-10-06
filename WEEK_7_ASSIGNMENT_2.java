import java.util.Scanner;

public class WEEK_7_ASSIGNMENT_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = scanner.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It's a vowel!");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It's a consonant!");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
