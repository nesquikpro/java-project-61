package hexlet.code.games;

import hexlet.code.Game;

public class Calculator extends Game {
    /**
     * Correct answer to the question.
     */
    private String correctAnswer;

    /**
     * Get game question.
     * @return game question.
     */
    @Override
    public String getQuestion() {
        char[] operators = {'+', '-', '*'};
        int firstNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        int secondNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER);
        char operator = operators[RANDOM.nextInt(operators.length)];

        var currentQuestion = firstNumber + " " + operator + " "
                + secondNumber;
        correctAnswer = String.valueOf(calculateExpression(operator,
                firstNumber, secondNumber));
        return currentQuestion;
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
        System.out.println("What is the result of the expression?");
    }

    /**
     * Check true answer.
     * @param operator operator of expression.
     * @param firstNumber first Number.
     * @param secondNumber second Number.
     * @return calculated result.
     */
    private static int calculateExpression(final char operator,
                                               final int firstNumber,
                                               final int secondNumber) {
        return switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new IllegalArgumentException("Invalid operator: "
                    + operator);
        };
    }
}
