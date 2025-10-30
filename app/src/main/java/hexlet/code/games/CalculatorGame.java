package hexlet.code.games;

import hexlet.code.core.GameEngine;
import hexlet.code.utils.Utils;

public final class CalculatorGame {
    private static final String DESCRIPTION = "What is the result "
            + "of the expression?";

    private static final String[] OPERATORS = {"+", "-", "*"};

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.getDefaultRandomNumber();
            int secondNumber = Utils.getDefaultRandomNumber();
            String operator = OPERATORS[Utils.getRandomNumberFromRange(OPERATORS.length)];

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
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException(
                    "Invalid operator: " + operator);
        };
    }

    private CalculatorGame() {

    }
}
