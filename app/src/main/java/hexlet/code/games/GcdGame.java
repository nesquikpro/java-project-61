package hexlet.code.games;

import hexlet.code.core.GameEngine;
import hexlet.code.utils.Utils;

public final class GcdGame {
    private static final String DESCRIPTION = "Find the greatest common "
            + "divisor of given numbers.";

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int a = Utils.getDefaultRandomNumber();
            int b = Utils.getDefaultRandomNumber();
            int correctAnswer = getGCD(a, b);

            gameQuestions[i][0] = a + " " + b;
            gameQuestions[i][1] = String.valueOf(correctAnswer);
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private static int getGCD(final int a, final int b) {
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    private GcdGame() {

    }
}
