package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

public final class ProgressionGame {
    private static final String DESCRIPTION = "What number is "
            + "missing in the progression?";

    private static final int PROGRESS_LENGTH = 10;
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int DEFAULT_MAX = 51;

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int a = RANDOM_GENERATOR.nextInt(DEFAULT_MAX);
            int d = RANDOM_GENERATOR.nextInt(PROGRESS_LENGTH);
            int hiddenIndex = RANDOM_GENERATOR.nextInt(PROGRESS_LENGTH);
            String[] progression = generateProgression(a, d);

            String correctAnswer = String.valueOf(progression[hiddenIndex]);
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            gameQuestions[i][0] = question;
            gameQuestions[i][1] = correctAnswer;
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private static String[] generateProgression(int start, int step) {
        String[] progression = new String[PROGRESS_LENGTH];

        for (int i = 0; i < PROGRESS_LENGTH; i++) {
            int currentValue = start + i * step;
            progression[i] = String.valueOf(currentValue);
        }
        return progression;
    }

    private ProgressionGame() {

    }
}
