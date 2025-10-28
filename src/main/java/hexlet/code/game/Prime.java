package hexlet.code.game;

import hexlet.code.Game;

/**
 * The type Prime.
 */
public class Prime extends Game {
    /**
     * Correct answer to the question.
     */
    private String correctAnswer;

    /**
     * Printing rules for game.
     */
    @Override
    public void printRules() {
        System.out.println("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
    }

    /**
     * Get game question.
     * @return game question.
     */
    @Override
    public String generateQuestion() {
        int number = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        correctAnswer = isPrime(number) ? "yes" : "no";
        return String.valueOf(number);
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
     * @return correct answer.
     */
    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Checking if a number is prime or not.
     * @param number tested number.
     * @return yes or no.
     */
    private boolean isPrime(final int number) {
            if (number < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        return true;
    }
}
