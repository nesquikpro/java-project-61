package hexlet.code.games;

import hexlet.code.core.GameEngine;

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
        String[][] gameQuestions = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            int a = GameEngine.getRandomNumber();
            int d = GameEngine.getRandomNumber(PROGRESS_LENGTH);
            int hiddenIndex = GameEngine.getRandomNumber(PROGRESS_LENGTH);

            String[] progressionData = generateProgression(a, d, hiddenIndex);
            gameQuestions[i][0] = progressionData[0];
            gameQuestions[i][1] = progressionData[1];
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private static String[] generateProgression(final int a, final int d,
                                                final int hiddenIndex) {
        StringBuilder sb = new StringBuilder();
        String correctAnswer = "";

        for (int j = 0; j < PROGRESS_LENGTH; j++) {
            var current = String.valueOf(a + j * d);

            if (hiddenIndex == j) {
                correctAnswer = current;
                sb.append("..");
            } else {
                sb.append(current);
            }
            sb.append(" ");
        }

        return new String[] {
                sb.toString(), correctAnswer
        };
    }
    private ProgressionGame() {

    }
}
