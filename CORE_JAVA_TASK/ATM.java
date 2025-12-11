import java.util.*;

class BankAccount {
    String accNo;
    String name;
    double balance;
    ArrayList<String> mini = new ArrayList<>();

    BankAccount(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void add(String t) {
        if (mini.size() == 5)
            mini.remove(0);
        mini.add(t);
    }
}

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount("2025A", "Kavi", 5000);

        while (true) {

            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Balance Check");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Balance: ₹" + b.balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    b.balance += d;
                    b.add("Deposit ₹" + d);
                    System.out.println("Deposited");
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    if (w <= b.balance) {
                        b.balance -= w;
                        b.add("Withdraw ₹" + w);
                        System.out.println("Withdrawn");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("--- Last 5 Transactions ---");
                    for (String s : b.mini) System.out.println(s);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
