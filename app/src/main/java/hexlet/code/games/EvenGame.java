package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

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
        int randomNumbers = GameEngine.getRandomNumbers();
        String[][] gameQuestions = new String[rounds][2];
        // NOSONAR
        Random rand = new Random();

        for (int i = 0; i < rounds; i++) {
            int randomNumber = rand.nextInt(randomNumbers);
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            gameQuestions[i][0] = String.valueOf(randomNumber);
            gameQuestions[i][1] = correctAnswer;
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private EvenGame() {

    }
}
