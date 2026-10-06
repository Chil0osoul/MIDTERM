public class Week_7_program_5 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("A");
                }
            }
            System.out.println();
        }
    }
}
