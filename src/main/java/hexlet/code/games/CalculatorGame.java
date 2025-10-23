package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public final class CalculatorGame extends Game {
    /**
     * Start Calculator Game.
     */
    @Override
    public void startGame() {
        super.startGame();

        char[] operators = {'+', '-', '*'};
        Random rnd = new Random();

        for (int i = 0; i < QUESTION_COUNT; i++) {
            int firstNumber = rnd.nextInt(MAX_RANDOM_NUMBER);
            int secondNumber = rnd.nextInt(MAX_RANDOM_NUMBER);

            int operatorIndex = rnd.nextInt(operators.length);
            char operator = operators[operatorIndex];

            String expression = firstNumber + " " + String.valueOf(operator)
                    + " " + secondNumber;
            System.out.println("Question: " + expression);

            System.out.print("Your answer: ");
            String userReply = USER_INPUT.nextLine();

            if (Integer.parseInt(userReply) == calculateExpression(
                    operator,
                    firstNumber,
                    secondNumber)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userReply + "' is wrong answer ;(. "
                        + "Correct answer was '" + userReply + "'.\n"
                        + "Let's try again, Sam!");
                System.exit(0);
            }
        }
        congratulateUser();
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
     * @return check the user's reply with the answer.
     */
    private static int calculateExpression(final char operator,
                                               final int firstNumber,
                                               final int secondNumber) {
        return switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> 0;
        };
    }
}
