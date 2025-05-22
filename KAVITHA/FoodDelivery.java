import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Food Type, Quantity, Distance
        System.out.print("Enter Food Type (V/N), Quantity, and Distance (kms): ");
        char foodType = sc.next().charAt(0);
        int quantity = sc.nextInt();
        int distance = sc.nextInt();
        
        int cost = 0;
        int deliveryCharge = 0;
        int totalAmount = 0;

        // Input Validation
        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            System.out.println("-1");  // Invalid input
            return;
        }

        // Calculate food cost
        if (foodType == 'V') {
            cost = 12 * quantity;  // Vegetarian: $12 per plate
        } else if (foodType == 'N') {
            cost = 15 * quantity;  // Non-Vegetarian: $15 per plate
        }

        // Calculate delivery charge
        if (distance > 3) {
            if (distance <= 6) {
                deliveryCharge = (distance - 3) * 1;  // Next 3 km: $1/km
            } else {
                deliveryCharge = (3 * 1) + ((distance - 6) * 2);  // Remaining kms: $2/km
            }
        }

        // Calculate final amount
        totalAmount = cost + deliveryCharge;

        // Output the final bill amount
        System.out.println("Final bill amount:"+totalAmount);
    }
}