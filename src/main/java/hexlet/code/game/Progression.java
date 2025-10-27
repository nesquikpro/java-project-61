package hexlet.code.game;

import hexlet.code.Game;

/**
 * The type Progression.
 */
public class Progression extends Game {
    /**
     * Correct answer to the question.
     */
    private String correctAnswer;
    /**
     * Max progression length.
     */
    private static final int MAX_PROGRESS_LENGTH = 10;

    /**
     * Printing rules for game.
     */
    @Override
    public void printRules() {
        System.out.println("What number is missing "
                + "in the progression?");
    }

    /**
     * Get game question.
     * @return game question.
     */
    @Override
    public String generateQuestion() {
        return generateProgression();
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
     * Get random progression.
     * @return progression.
     */
    private String generateProgression() {
        int a = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        int d = RANDOM.nextInt(MAX_PROGRESS_LENGTH) + 1;
        int replaced = RANDOM.nextInt(MAX_PROGRESS_LENGTH);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MAX_PROGRESS_LENGTH; i++) {
            var current = String.valueOf(a + i * d);

            if (replaced == i) {
                correctAnswer = current;
                sb.append("..");
            } else {
                sb.append(current);
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
