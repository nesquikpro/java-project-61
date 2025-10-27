package hexlet.code.game;

import hexlet.code.Game;

public class Even extends Game {
    /**
     * Correct answer to the question.
     */
    private String correctAnswer;

    /**
     * Get game question.
     * @return game question.
     */
    @Override
    public String generateQuestion() {
        int number = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        correctAnswer = checkEven(number) ? "yes" : "no";
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
     * Get correct answer.
     * @return true answer.
     */
    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Printing rules for game.
     */
    @Override
    public void printRules() {
            System.out.println("Answer 'yes' if the number is even, "
                    + "otherwise answer 'no'");
    }

    /**
     * Checking if a number is even.
     * @param randomNumber random number.
     * @return true if the number is even, false otherwise.
     */
    public static boolean checkEven(final int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
