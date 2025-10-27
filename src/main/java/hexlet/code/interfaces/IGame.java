package hexlet.code.interfaces;

public interface IGame {
    /**
     * Get username.
     */
    void greetUser();
    /**
     * Starting game.
     */
    void startGame();
    /**
     * Printing rules for game.
     */
    void printRules();
    /**
     * Get game question.
     * @return game question.
     */
    String generateQuestion();
    /**
     * Check if the true answer.
     * @param userAnswer user answer.
     * @return game question.
     */
    boolean isCorrectAnswer(String userAnswer);
    /**
     * Get correct answer.
     * @return true answer.
     */
    String getCorrectAnswer();
}
