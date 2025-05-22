// PlayerRating class to store player details and calculate ratings
class PlayerRating {
    private int playerPosition;
    private String playerName;
    private float criticOneRating, criticTwoRating, criticThreeRating;
    private float averageRating;
    private char category;

    // Constructor to initialize player details
    public PlayerRating(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    // Method to calculate average rating for two critics
    public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.averageRating = (criticOneRating + criticTwoRating) / 2;
        calculateCategory();
    }

    // Overloaded method to calculate average rating for three critics
    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.criticThreeRating = criticThreeRating;
        this.averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
        calculateCategory();
    }

    // Method to determine player category based on average rating
    private void calculateCategory() {
        if (averageRating > 8) {
            category = 'A';
        } else if (averageRating > 5 && averageRating <= 8) {
            category = 'B';
        } else if (averageRating > 0 && averageRating <= 5) {
            category = 'C';
        } else {
            category = 'N'; // Invalid rating case
        }
    }

    // Method to display player details
    public void display() {
        System.out.println("Player Position: " + playerPosition);
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + averageRating);
        System.out.println("Category: " + category);
    }
}

// Tester class to execute the program
public class PlayerRatingTester {
    public static void main(String[] args) {
        // Creating player objects and calculating ratings
        PlayerRating player1 = new PlayerRating(10, "John Doe");
        player1.calculateAverageRating(8.5f, 7.2f, 9.0f); // Three critics
        player1.display();

        System.out.println();

        PlayerRating player2 = new PlayerRating(7, "Jane Smith");
        player2.calculateAverageRating(5.0f, 6.8f); // Two critics
        player2.display();
    }
}

