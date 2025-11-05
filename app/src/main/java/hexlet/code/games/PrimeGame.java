package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

public final class PrimeGame {
    private static final String DESCRIPTION = "Answer 'yes' if given "
            + "number is prime. Otherwise answer 'no'.";

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int DEFAULT_MAX = 51;

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int randomNumber = RANDOM_GENERATOR.nextInt(DEFAULT_MAX);
            gameQuestions[i][0] = Integer.toString(randomNumber);
            gameQuestions[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

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
