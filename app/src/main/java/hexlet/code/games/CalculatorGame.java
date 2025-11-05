package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

public final class CalculatorGame {
    private static final String DESCRIPTION = "What is the result "
            + "of the expression?";

    private static final String[] OPERATORS = {"+", "-", "*"};

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int DEFAULT_MAX = 51;

    /**
     * Start of the game.
     */
    public static void startGame() {
        String[][] gameQuestions = new String[GameEngine.ROUNDS_COUNT][2];

        for (int i = 0; i < GameEngine.ROUNDS_COUNT; i++) {
            int firstNumber = RANDOM_GENERATOR.nextInt(DEFAULT_MAX);
            int secondNumber = RANDOM_GENERATOR.nextInt(DEFAULT_MAX);
            String operator = OPERATORS[RANDOM_GENERATOR.nextInt(OPERATORS.length)];

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
