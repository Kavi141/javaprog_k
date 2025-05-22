class prime {
    public static void main(String args[]) {
        int n = 9;
        int count = 0;

        if (n == 0 || n == 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
