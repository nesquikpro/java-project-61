package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

public final class PrimeGame {
    /**
     * Game description.
     */
    private static final String DESCRIPTION = "Answer 'yes' if given "
            + "number is prime. Otherwise answer 'no'.";

    /**
     * Start of the game.
     */
    @SuppressWarnings("java:S2245")
    public static void startGame() {
        int rounds = GameEngine.getRoundsCount();
        int randomNumbers = GameEngine.getRandomNumbers();
        String[][] gameQuestions = new String[rounds][2];
        Random rand = new Random();

        for (int i = 0; i < rounds; i++) {
            int randomNumber = rand.nextInt(randomNumbers);
            gameQuestions[i][0] = Integer.toString(randomNumber);
            gameQuestions[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    /**
     * @param number tested number.
     * @return prime number or not. true or false.
     */
    private static boolean isPrime(final int number) {
            if (number < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        return true;
    }

    private PrimeGame() {

    }
}
