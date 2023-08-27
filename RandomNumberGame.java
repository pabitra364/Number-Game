import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {
        int minRange = 1;
        int maxRange = 100;

        int randomNum = generateRandomNumber(minRange, maxRange);

        System.out.println("Guess the random number between " + minRange + " and " + maxRange + ":");
        int userGuess = getUserGuess();

        if (userGuess == randomNum) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Oops! Your guess is incorrect. The random number was: " + randomNum);
        }
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static int getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        scanner.close();
        return guess;
    }
}
