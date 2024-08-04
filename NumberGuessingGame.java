import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;

            System.out.println("I have generated a random number between 1 and 100. Try to guess it!");

            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                }
            } while (guess != randomNumber);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
