package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

public final class ProgressionGame {
    /**
     * Game description.
     */
    private static final String DESCRIPTION = "What number is "
            + "missing in the progression?";

    /**
     * Size of progression.
     */
    private static final int PROGRESS_LENGTH = 11;

    /**
     * Start of the game.
     */
    public static void startGame() {
        int rounds = GameEngine.getRoundsCount();
        int randomNumbers = GameEngine.getRandomNumbers();
        String[][] gameQuestions = new String[rounds][2];
        // NOSONAR
        Random rand = new Random();

        for (int i = 0; i < rounds; i++) {
            int a = rand.nextInt(randomNumbers);
            int d = rand.nextInt(PROGRESS_LENGTH);
            int hiddenNumber = rand.nextInt(PROGRESS_LENGTH);

            StringBuilder sb = new StringBuilder();
            String correctAnswer = "";

            for (int j = 0; j < PROGRESS_LENGTH; j++) {
                var current = String.valueOf(a + j * d);

                if (hiddenNumber == j) {
                    correctAnswer = current;
                    sb.append("..");
                } else {
                    sb.append(current);
                }
                sb.append(" ");
            }

            gameQuestions[i][0] = sb.toString();
            gameQuestions[i][1] = correctAnswer;
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private ProgressionGame() {

    }
}
