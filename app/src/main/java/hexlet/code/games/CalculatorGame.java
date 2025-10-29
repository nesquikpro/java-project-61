package hexlet.code.games;

import hexlet.code.core.GameEngine;

import java.util.Random;

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
        int randomNumbers = GameEngine.getRandomNumbers();
        String[][] gameQuestions = new String[rounds][2];
        // NOSONAR
        Random rand = new Random();

        for (int i = 0; i < rounds; i++) {
            int firstNumber = rand.nextInt(randomNumbers);
            int secondNumber = rand.nextInt(randomNumbers);
            String operator = OPERATORS[rand.nextInt(OPERATORS.length)];

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
