package hexlet.code.games;

import hexlet.code.Game;

public final class CalculatorGame extends Game {
    /**
     * Start Calculator Game.
     */
    @Override
    public void startGame() {
        super.startGame();

        char[] operators = {'+', '-', '*'};

        for (int i = 0; i < QUESTION_COUNT; i++) {
            int firstNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER);
            int secondNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER);

            int operatorIndex = RANDOM.nextInt(operators.length);
            char operator = operators[operatorIndex];

            String expression = firstNumber + " " + operator + " "
                    + secondNumber;
            System.out.println("Question: " + expression);

            System.out.print("Your answer: ");
            String userReply = USER_INPUT.nextLine();

            int calculatedAnswer = calculateExpression(operator,
                    firstNumber,
                    secondNumber);
            if (Integer.parseInt(userReply) == calculatedAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userReply + "' is wrong answer ;(. "
                        + "Correct answer was '" + calculatedAnswer + "'.\n"
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
