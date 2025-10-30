package hexlet.code.games;

import hexlet.code.core.GameEngine;
import hexlet.code.utils.Utils;

public final class PrimeGame {
    private static final String DESCRIPTION = "Answer 'yes' if given "
            + "number is prime. Otherwise answer 'no'.";

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int randomNumber = Utils.getDefaultRandomNumber();
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
