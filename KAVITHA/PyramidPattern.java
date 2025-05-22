import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars with space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
