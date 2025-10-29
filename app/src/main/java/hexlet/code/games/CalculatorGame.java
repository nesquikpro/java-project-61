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

            int result = switch (operator) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                default -> throw new IllegalArgumentException(
                        "Invalid operator: " + operator);
            };

            gameQuestions[i][0] = firstNumber + " " + operator
                    + " " + secondNumber;
            gameQuestions[i][1] = String.valueOf(result);
        }

        GameEngine.runGame(DESCRIPTION, gameQuestions);
    }

    private CalculatorGame() {

    }
}
