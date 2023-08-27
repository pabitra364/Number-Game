import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame2 {

    public static void main(String[] args) {
        int minRange = 1;
        int maxRange = 100;

        int randomNum = generateRandomNumber(minRange, maxRange);

        System.out.println("Guess the random number between " + minRange + " and " + maxRange + ":");

        int userGuess;
        do {
            userGuess = getUserGuess();
            if (userGuess == randomNum) {
                System.out.println("Congratulations! Your guess is correct.");
            } else if (userGuess < randomNum) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        } while (userGuess != randomNum);
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static int getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        return guess;
    }
}
