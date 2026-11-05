import java.util.Scanner;

public class OOPR_MIDTERM_LAB_ACTIVITY_3_1to31 {

    public static void main(String[] args) {
        program1();
        program2();
        program3();
        program4();
        program5();
        program6();
        program7();
        program8();
        program9();
        program10();
        program11();
        program12();
        program13();
        program14();
        program15();
        program16();
        program17();
        program18();
        program19();
        program20();
        program21();
        program22();
        program23();
        program24();
        program25();
        program26();
        program27();
        program28();
        program29();
        program30();
        program31();
    }

    public static int program1() {
        System.out.println("\nActivity 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ltr = scanner.next().charAt(0);
        if (!Character.isLetter(ltr)) {
            System.out.println("Not a letter");
            return 0;
        }
        String rslt;
        if (ltr == 'A' || ltr == 'a') {
            rslt = "VOWEL";
        } else if (ltr == 'E' || ltr == 'e') {
            rslt = "VOWEL";
        } else if (ltr == 'I' || ltr == 'i') {
            rslt = "VOWEL";
        } else if (ltr == 'O' || ltr == 'o') {
            rslt = "VOWEL";
        } else if (ltr == 'U' || ltr == 'u') {
            rslt = "VOWEL";
        } else {
            rslt = "CONSONANT";
        }
        System.out.println("1st solution (if): " + rslt);
        switch (Character.toUpperCase(ltr)) {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            rslt = "VOWEL";
            break;
        default:
            rslt = "CONSONANT";
        }
        System.out.println("2nd solution (switch): " + rslt);
        return 0;
    }

    public static int program2() {
        System.out.println("\nActivity 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (month day year): ");
        int mnth = scanner.nextInt();
        int dy = scanner.nextInt();
        int yr = scanner.nextInt();
        String mnm = "";
        if (mnth == 1) {
            mnm = "January";
        } else if (mnth == 2) {
            mnm = "February";
        } else if (mnth == 3) {
            mnm = "March";
        } else if (mnth == 4) {
            mnm = "April";
        } else if (mnth == 5) {
            mnm = "May";
        } else if (mnth == 6) {
            mnm = "June";
        } else if (mnth == 7) {
            mnm = "July";
        } else if (mnth == 8) {
            mnm = "August";
        } else if (mnth == 9) {
            mnm = "September";
        } else if (mnth == 10) {
            mnm = "October";
        } else if (mnth == 11) {
            mnm = "November";
        } else if (mnth == 12) {
            mnm = "December";
        } else {
            mnm = "Invalid";
        }
        if (mnm.equals("Invalid") || dy < 1 || dy > 31) {
            System.out.println("Invalid date");
            return 0;
        }
        System.out.println("1st solution (if): " + mnm + " " + dy + ", " + yr);
        switch (mnth) {
        case 1:
            mnm = "January";
            break;
        case 2:
            mnm = "February";
            break;
        case 3:
            mnm = "March";
            break;
        case 4:
            mnm = "April";
            break;
        case 5:
            mnm = "May";
            break;
        case 6:
            mnm = "June";
            break;
        case 7:
            mnm = "July";
            break;
        case 8:
            mnm = "August";
            break;
        case 9:
            mnm = "September";
            break;
        case 10:
            mnm = "October";
            break;
        case 11:
            mnm = "November";
            break;
        case 12:
            mnm = "December";
            break;
        default:
            mnm = "Invalid";
        }
        System.out.println("2nd solution (switch): " + mnm + " " + dy + ", " + yr);
        return 0;
    }

    public static int program3() {
        System.out.println("\nActivity 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temp: ");
        double temp = scanner.nextDouble();
        if (temp < 0) {
            System.out.println("ICE");
        } else if (temp <= 100) {
            System.out.println("WATER");
        } else {
            System.out.println("STEAM");
        }
        return 0;
    }

    public static int program4() {
        System.out.println("\nActivity 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed (km/h): ");
        double spd = scanner.nextDouble();
        System.out.print("Enter length (m): ");
        double lgth = scanner.nextDouble();
        if (spd > 1100 && lgth > 52) {
            System.out.println("Civilian aircraft");
        } else if (spd >= 500 && lgth >= 20) {
            System.out.println("Military aircraft");
        } else {
            System.out.println("It's a bird");
        }
        return 0;
    }

    public static int program5() {
        System.out.println("\nActivity 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class ID: ");
        char cid = scanner.next().charAt(0);
        String shp;
        if (cid == 'B' || cid == 'b') {
            shp = "Battleship";
        } else if (cid == 'C' || cid == 'c') {
            shp = "Cruiser";
        } else if (cid == 'D' || cid == 'd') {
            shp = "Destroyer";
        } else if (cid == 'F' || cid == 'f') {
            shp = "Frigate";
        } else {
            shp = "Unknown class ID";
        }
        System.out.println("1st solution (if): " + shp);
        switch (cid) {
        case 'B':
        case 'b':
            shp = "Battleship";
            break;
        case 'C':
        case 'c':
            shp = "Cruiser";
            break;
        case 'D':
        case 'd':
            shp = "Destroyer";
            break;
        case 'F':
        case 'f':
            shp = "Frigate";
            break;
        default:
            shp = "Unknown class ID";
        }
        System.out.println("2nd solution (switch): " + shp);
        return 0;
    }

    public static int program6() {
        System.out.println("\nActivity 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter richter scale: ");
        double rich = scanner.nextDouble();
        if (rich < 5.0) {
            System.out.println("Little or no damage");
        } else if (rich < 5.5) {
            System.out.println("Some damage");
        } else if (rich < 6.5) {
            System.out.println("Serious damage");
        } else if (rich < 7.5) {
            System.out.println("Disaster");
        } else {
            System.out.println("Catastrophe");
        }
        return 0;
    }

    public static int program7() {
        System.out.println("\nActivity 7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 0 || num > 3000) {
            System.out.println("Number must be from 0 to 3000");
            return 0;
        }
        if (num == 0) {
            System.out.println("zero");
            return 0;
        }
        String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        String wrds = "";
        if (num >= 1000) {
            wrds += ones[num / 1000] + " thousand ";
        }
        if ((num % 1000) >= 100) {
            wrds += ones[(num % 1000) / 100] + " hundred ";
        }
        int rest = num % 100;
        if (rest >= 20) {
            wrds += tens[rest / 10] + " " + ones[rest % 10];
        } else {
            wrds += ones[rest];
        }
        System.out.println(wrds.trim());
        return 0;
    }

    public static int program8() {
        System.out.println("\nActivity 8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 1 || num > 3000) {
            System.out.println("Number must be from 1 to 3000");
            return 0;
        }
        int[] vals = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] syms = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String rmn = "";
        for (int x = 0; x < vals.length; x++) {
            while (num >= vals[x]) {
                rmn += syms[x];
                num -= vals[x];
            }
        }
        System.out.println(rmn);
        return 0;
    }

    public static int program9() {
        System.out.println("\nActivity 9");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tuition fee: ");
        double fee = Double.parseDouble(scanner.next().replace(",", ""));
        System.out.println("(Press 1 for Cash, 2 for Two-Installment, 3 for Three-Installment)");
        System.out.print("Enter mode of payment: ");
        int mode = scanner.nextInt();
        double ttl = 0;
        switch (mode) {
        case 1:
            ttl = fee - (fee * 0.10);
            break;
        case 2:
            ttl = fee - (fee * 0.05);
            break;
        case 3:
            ttl = fee + (fee * 0.10);
            break;
        default:
            System.out.println("Invalid mode of payment");
            return 0;
        }
        System.out.println("Your total tuition fee is: " + String.format("%,.2f", ttl));
        return 0;
    }

    public static int program10() {
        System.out.println("\nActivity 10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade: ");
        int grd = scanner.nextInt();
        String eqvl;
        if (grd >= 98 && grd <= 100) {
            eqvl = "1.00";
        } else if (grd >= 95 && grd <= 97) {
            eqvl = "1.25";
        } else if (grd >= 92 && grd <= 94) {
            eqvl = "1.50";
        } else if (grd >= 89 && grd <= 91) {
            eqvl = "1.75";
        } else if (grd >= 85 && grd <= 88) {
            eqvl = "2.00";
        } else if (grd >= 82 && grd <= 84) {
            eqvl = "2.25";
        } else if (grd >= 80 && grd <= 81) {
            eqvl = "2.50";
        } else if (grd >= 77 && grd <= 79) {
            eqvl = "2.75";
        } else if (grd >= 75 && grd <= 76) {
            eqvl = "3.00";
        } else {
            eqvl = "Out-of-Range";
        }
        System.out.println("Grade equivalent: " + eqvl);
        return 0;
    }

    public static int program11() {
        System.out.println("\nActivity 11");
        System.out.println("1st solution (for)");
        System.out.println("Sequence nos.  Squared");
        for (int x = 1; x <= 5; x++) {
            System.out.printf("%-15d%d%n", x, x * x);
        }
        System.out.println("2nd solution (while)");
        System.out.println("Sequence nos.  Squared");
        int x = 1;
        while (x <= 5) {
            System.out.printf("%-15d%d%n", x, x * x);
            x++;
        }
        System.out.println("3rd solution (do while)");
        System.out.println("Sequence nos.  Squared");
        x = 1;
        do {
            System.out.printf("%-15d%d%n", x, x * x);
            x++;
        } while (x <= 5);
        return 0;
    }

    public static int program12() {
        System.out.println("\nActivity 12");
        System.out.print("1st solution (for): ");
        for (int x = 1; x <= 5; x++) {
            System.out.print(x + ", " + (6 - x) + ", ");
        }
        System.out.println();
        System.out.print("2nd solution (while): ");
        int x = 1;
        while (x <= 5) {
            System.out.print(x + ", " + (6 - x) + ", ");
            x++;
        }
        System.out.println();
        System.out.print("3rd solution (do while): ");
        x = 1;
        do {
            System.out.print(x + ", " + (6 - x) + ", ");
            x++;
        } while (x <= 5);
        System.out.println();
        return 0;
    }

    public static int program13() {
        System.out.println("\nActivity 13");
        System.out.print("1st solution (for): ");
        for (int x = 1; x <= 5; x++) {
            System.out.print((6 - x) + ", " + x + ", ");
        }
        System.out.println();
        System.out.print("2nd solution (while): ");
        int x = 1;
        while (x <= 5) {
            System.out.print((6 - x) + ", " + x + ", ");
            x++;
        }
        System.out.println();
        System.out.print("3rd solution (do while): ");
        x = 1;
        do {
            System.out.print((6 - x) + ", " + x + ", ");
            x++;
        } while (x <= 5);
        System.out.println();
        return 0;
    }

    public static int program14() {
        System.out.println("\nActivity 14");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int num = scanner.nextInt();
        if (num < 0 || num > 20) {
            System.out.println("Enter a number from 0 to 20");
            return 0;
        }
        long fact = 1;
        String cmpt = "";
        for (int x = 1; x <= num; x++) {
            fact *= x;
            cmpt += (x == 1 ? "" : "*") + x;
        }
        if (num == 0) {
            cmpt = "1";
        }
        System.out.println("1st solution (for) Factorial value : " + fact);
        fact = 1;
        int x = 1;
        while (x <= num) {
            fact *= x;
            x++;
        }
        System.out.println("2nd solution (while) Factorial value : " + fact);
        fact = 1;
        x = 1;
        do {
            fact *= x;
            x++;
        } while (x <= num);
        System.out.println("3rd solution (do while) Factorial value : " + fact);
        System.out.println("( The computation is : " + cmpt + "=" + fact + " )");
        return 0;
    }

    public static int program15() {
        System.out.println("\nActivity 15");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int num = scanner.nextInt();
        if (num < 1 || num > 90) {
            System.out.println("Enter a number from 1 to 90");
            return 0;
        }
        long fa = 1;
        long fb = 1;
        long fc = 0;
        System.out.print("1st solution (for) Fibonacci series: ");
        for (int x = 0; x < num; x++) {
            System.out.print(fa + " ");
            fc = fa + fb;
            fa = fb;
            fb = fc;
        }
        System.out.println();
        fa = 1;
        fb = 1;
        int x = 0;
        System.out.print("2nd solution (while) Fibonacci series: ");
        while (x < num) {
            System.out.print(fa + " ");
            fc = fa + fb;
            fa = fb;
            fb = fc;
            x++;
        }
        System.out.println();
        fa = 1;
        fb = 1;
        x = 0;
        System.out.print("3rd solution (do while) Fibonacci series: ");
        do {
            System.out.print(fa + " ");
            fc = fa + fb;
            fa = fb;
            fb = fc;
            x++;
        } while (x < num);
        System.out.println();
        return 0;
    }

    public static int program16() {
        System.out.println("\nActivity 16");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base no. ");
        int bse = scanner.nextInt();
        System.out.print("Enter exponent no. ");
        int expo = scanner.nextInt();
        if (expo < 0) {
            System.out.println("Exponent must not be negative");
            return 0;
        }
        long pwr = 1;
        String cmpt = "";
        for (int x = 0; x < expo; x++) {
            pwr *= bse;
            cmpt += (x == 0 ? "" : " * ") + bse;
        }
        if (expo == 0) {
            cmpt = "1";
        }
        System.out.println("1st solution (for) Power value: " + pwr);
        pwr = 1;
        int x = 0;
        while (x < expo) {
            pwr *= bse;
            x++;
        }
        System.out.println("2nd solution (while) Power value: " + pwr);
        pwr = 1;
        x = 0;
        if (expo > 0) {
            do {
                pwr *= bse;
                x++;
            } while (x < expo);
        }
        System.out.println("3rd solution (do while) Power value: " + pwr);
        System.out.println("( The computation is : " + bse + "^" + expo + " = " + cmpt + " = " + pwr + " )");
        return 0;
    }

    public static int program17() {
        System.out.println("\nActivity 17");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 1) {
            System.out.println("Enter a number greater than 0");
            return 0;
        }
        long sm = 0;
        for (int x = 1; x <= num; x++) {
            sm += (long) x * x;
        }
        System.out.println("1st solution (for) Sum of squares: " + sm);
        sm = 0;
        int x = 1;
        while (x <= num) {
            sm += (long) x * x;
            x++;
        }
        System.out.println("2nd solution (while) Sum of squares: " + sm);
        sm = 0;
        x = 1;
        do {
            sm += (long) x * x;
            x++;
        } while (x <= num);
        System.out.println("3rd solution (do while) Sum of squares: " + sm);
        return 0;
    }

    public static int program18() {
        System.out.println("\nActivity 18");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 1) {
            System.out.println("Enter a number greater than 0");
            return 0;
        }
        long sm = 0;
        for (int x = 1; x <= num; x++) {
            sm += x;
        }
        System.out.println("1st solution (for) Sum: " + sm);
        sm = 0;
        int x = 1;
        while (x <= num) {
            sm += x;
            x++;
        }
        System.out.println("2nd solution (while) Sum: " + sm);
        sm = 0;
        x = 1;
        do {
            sm += x;
            x++;
        } while (x <= num);
        System.out.println("3rd solution (do while) Sum: " + sm);
        return 0;
    }

    public static int program19() {
        System.out.println("\nActivity 19");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Enter a number that is not negative");
            return 0;
        }
        long rvrs = 0;
        for (int tmp = num; tmp > 0; tmp /= 10) {
            rvrs = (rvrs * 10) + (tmp % 10);
        }
        System.out.println("1st solution (for) Reverse number: " + rvrs);
        rvrs = 0;
        int tmp = num;
        while (tmp > 0) {
            rvrs = (rvrs * 10) + (tmp % 10);
            tmp /= 10;
        }
        System.out.println("2nd solution (while) Reverse number: " + rvrs);
        rvrs = 0;
        tmp = num;
        do {
            rvrs = (rvrs * 10) + (tmp % 10);
            tmp /= 10;
        } while (tmp > 0);
        System.out.println("3rd solution (do while) Reverse number: " + rvrs);
        return 0;
    }

    public static int program20() {
        System.out.println("\nActivity 20");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 1 || num > 15) {
            System.out.println("Enter a number from 1 to 15");
            return 0;
        }
        long sm = 0;
        for (int x = 1; x <= num; x++) {
            long pw = 1;
            for (int y = 0; y < x; y++) {
                pw *= x;
            }
            sm += pw;
        }
        System.out.println("1st solution (for) Sum of powers: " + sm);
        sm = 0;
        int x = 1;
        while (x <= num) {
            long pw = 1;
            int y = 0;
            while (y < x) {
                pw *= x;
                y++;
            }
            sm += pw;
            x++;
        }
        System.out.println("2nd solution (while) Sum of powers: " + sm);
        sm = 0;
        x = 1;
        do {
            long pw = 1;
            int y = 0;
            do {
                pw *= x;
                y++;
            } while (y < x);
            sm += pw;
            x++;
        } while (x <= num);
        System.out.println("3rd solution (do while) Sum of powers: " + sm);
        return 0;
    }

    public static int program21() {
        System.out.println("\nActivity 21");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program22() {
        System.out.println("\nActivity 22");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(((x + y) % 2 == 0 ? 1 : 0) + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program23() {
        System.out.println("\nActivity 23");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < (rws - x) * 2; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < (2 * x) - 1; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program24() {
        System.out.println("\nActivity 24");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < rws - x; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < x; y++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program25() {
        System.out.println("\nActivity 25");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < rws - x; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program26() {
        System.out.println("\nActivity 26");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        int nmbr = 1;
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < rws - x; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < x; y++) {
                System.out.print(nmbr + " ");
                nmbr++;
            }
            System.out.println();
        }
        return 0;
    }

    public static int program27() {
        System.out.println("\nActivity 27");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        int nmbr = 1;
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(nmbr + " ");
                nmbr++;
            }
            System.out.println();
        }
        return 0;
    }

    public static int program28() {
        System.out.println("\nActivity 28");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program29() {
        System.out.println("\nActivity 29");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program30() {
        System.out.println("\nActivity 30");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < (rws - x) * 2; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < (2 * x) - 1; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int x = rws - 1; x >= 1; x--) {
            for (int y = 0; y < (rws - x) * 2; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < (2 * x) - 1; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int program31() {
        System.out.println("\nActivity 31");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rws = scanner.nextInt();
        for (int x = 1; x <= rws; x++) {
            for (int y = 0; y < (rws - x) * 2; y++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            for (int y = x - 1; y >= 1; y--) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        return 0;
    }
}