package hexlet.code.games;

import hexlet.code.core.GameEngine;

public final class CalculatorGame {
    /**
     * Game description.
     */
    private static final String DESCRIPTION = "What is the result "
            + "of the expression?";

    /**
     * List of operators.
     */
    private static final String[] OPERATORS = {"+", "-", "*"};

    /**
     * Start of the game.
     */
    public static void startGame() {
        int rounds = GameEngine.getRoundsCount();
        String[][] gameQuestions = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            int firstNumber = GameEngine.getRandomNumber();
            int secondNumber = GameEngine.getRandomNumber();
            String operator = OPERATORS[GameEngine.getRandomNumber(
                    OPERATORS.length)];

            gameQuestions[i][0] = firstNumber + " " + operator
                    + " " + secondNumber;
            gameQuestions[i][1] = String.valueOf(calculate(operator,
                    firstNumber, secondNumber));
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private static int calculate(final String operator,
                                 final int a, final int b) {
        return switch (operator) {
            case " + " -> a + b;
            case " - " -> a - b;
            case " * " -> a * b;
            default -> throw new IllegalArgumentException(
                    "Invalid operator: " + operator);
        };
    }

    private CalculatorGame() {

    }
}
