package hexlet.code.games;

import hexlet.code.core.GameEngine;

public final class GcdGame {
    /**
     * Game description.
     */
    private static final String DESCRIPTION = "Find the greatest common "
            + "divisor of given numbers.";

    /**
     * Start of the game.
     */
    public static void startGame() {
        int rounds = GameEngine.getRoundsCount();
        String[][] gameQuestions = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            int a = GameEngine.getRandomNumber();
            int b = GameEngine.getRandomNumber();
            int correctAnswer = getGCD(a, b);

            gameQuestions[i][0] = a + " " + b;
            gameQuestions[i][1] = String.valueOf(correctAnswer);
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    /**
     * @param a first number
     * @param b second number
     * @return the greatest common divisor of the first and second numbers.
     */
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
