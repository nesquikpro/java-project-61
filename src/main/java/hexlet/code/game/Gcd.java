package hexlet.code.game;

import hexlet.code.Game;

public class Gcd extends Game {
    /**
     * Correct answer to the question.
     */
    private String correctAnswer;

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
    public String generateQuestion() {
        int a = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        int b = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        correctAnswer = String.valueOf(getGCD(a, b));
        return a + " " + b;
    }

    /**
     * Check if the true answer.
     * @param userAnswer user answer.
     * @return game question.
     */
    @Override
    public boolean isCorrectAnswer(final String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    /**
     * Get correct answer.
     * @return true answer.
     */
    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
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
