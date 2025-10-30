package hexlet.code.games;

import hexlet.code.core.GameEngine;
import hexlet.code.utils.Utils;

public final class EvenGame {
    private static final String DESCRIPTION = "Answer 'yes' if the number "
            + "is even, otherwise answer 'no'.";

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int randomNumber = Utils.getDefaultRandomNumber();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            gameQuestions[i][0] = String.valueOf(randomNumber);
            gameQuestions[i][1] = correctAnswer;
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private EvenGame() {

    }
}
