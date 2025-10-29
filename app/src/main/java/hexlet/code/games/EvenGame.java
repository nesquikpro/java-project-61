package hexlet.code.games;

import hexlet.code.core.GameEngine;

public final class EvenGame {
    /**
     * Game description.
     */
    private static final String DESCRIPTION = "Answer 'yes' if the number "
            + "is even, otherwise answer 'no'.";

    /**
     * Start of the game.
     */
    public static void startGame() {
        int rounds = GameEngine.getRoundsCount();
        String[][] gameQuestions = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            int randomNumber = GameEngine.getRandomNumber();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            gameQuestions[i][0] = String.valueOf(randomNumber);
            gameQuestions[i][1] = correctAnswer;
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private EvenGame() {

    }
}
