package hexlet.code.games;

import hexlet.code.Game;

public class GCD extends Game {
    /**
     * Correct answer to the question.
     */
    private String currentAnswer;

    /**
     * Printing rules for game.
     */
    @Override
    public void printRules() {
        System.out.println("Find the greatest common "
                + "divisor of given numbers.");
    }

    /**
     * Get game question.
     * @return game question.
     */
    @Override
    public String getQuestion() {
        int a = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        int b = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        currentAnswer = String.valueOf(getGCD(a, b));
        return a + " " + b;
    }

    /**
     * Check if the true answer.
     * @param userAnswer user answer.
     * @return game question.
     */
    @Override
    public boolean isCorrectAnswer(final String userAnswer) {
        return userAnswer.equalsIgnoreCase(currentAnswer);
    }

    /**
     * Get correct answer.
     * @return true answer.
     */
    @Override
    public String getCorrectAnswer() {
        return currentAnswer;
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
}
