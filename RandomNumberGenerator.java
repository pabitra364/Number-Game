import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        int minRange = 1;
        int maxRange = 100;

        int randomNum = generateRandomNumber(minRange, maxRange);
        System.out.println(randomNum);
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
