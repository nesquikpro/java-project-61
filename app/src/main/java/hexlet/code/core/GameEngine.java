package hexlet.code.core;

import hexlet.code.utils.Cli;

import java.util.Scanner;

public final class GameEngine {

    public static final int ROUNDS_COUNT = 3;

    private static final Scanner USER_INPUT = new Scanner(System.in);

    /**
     * @param description rules of the game.
     * @param gameQuestions list of questions with correct answers.
     */
    public static void runGame(final String description,
                               final String[][] gameQuestions) {
        String userName = Cli.greet();

        System.out.println(description);

        for (String[] gameQuestion : gameQuestions) {
            String question = gameQuestion[0];
            String correctAnswer = gameQuestion[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = USER_INPUT.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }

    private GameEngine() {

    }
}
