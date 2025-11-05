package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

public final class EvenGame {
    private static final String DESCRIPTION = "Answer 'yes' if the number "
            + "is even, otherwise answer 'no'.";

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int DEFAULT_MAX = 101;

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int randomNumber = RANDOM_GENERATOR.nextInt(DEFAULT_MAX);
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            gameQuestions[i][0] = String.valueOf(randomNumber);
            gameQuestions[i][1] = correctAnswer;
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private EvenGame() {

    }
}
