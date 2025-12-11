public class HollowTriangle {
    public static void main(String[] args) {
        int n = 5;

        // Loop through rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Top row → only 1 star
            if (i == 1) {
                System.out.println("*");
            }

            // Bottom row → n stars with spaces
            else if (i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Middle rows → hollow
            else {
                System.out.print("*");               // left star
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");           // hollow space
                }
                System.out.print("*");               // right star
                System.out.println();
            }
        }
    }
}