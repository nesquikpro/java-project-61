package hexlet.code.games;

import hexlet.code.core.GameEngine;
import hexlet.code.utils.Utils;

public final class ProgressionGame {
    private static final String DESCRIPTION = "What number is "
            + "missing in the progression?";

    private static final int PROGRESS_LENGTH = 10;

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int a = Utils.getDefaultRandomNumber();
            int d = Utils.getRandomNumberFromRange(PROGRESS_LENGTH);
            int hiddenIndex = Utils.getRandomNumberFromRange(PROGRESS_LENGTH);

            int[] progression = generateProgression(a, d);
            String[] questionAndAnswer = createQuestion(progression, hiddenIndex);
            gameQuestions[i][0] = questionAndAnswer[0];
            gameQuestions[i][1] = questionAndAnswer[1];
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private static int[] generateProgression(int start, int step) {
        int[] progression = new int[PROGRESS_LENGTH];

        for (int i = 0; i < PROGRESS_LENGTH; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    private static String[] createQuestion(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();
            String correctAnswer = String.valueOf(progression[hiddenIndex]);

        for (int i = 0; i < progression.length; i++) {
            if (hiddenIndex == i) {
                question.append("..");
            } else {
                question.append(progression[i]);
            }
            question.append(" ");
        }
        return new String[] {question.toString(), correctAnswer};
    }

    private ProgressionGame() {

    }
}
