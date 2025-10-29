package hexlet.code.core;

import java.util.Scanner;

public final class GameEngine {
    /**
     * Random numbers from 0 to 100.
     */
    private static final int RANDOM_NUMBERS = 101;

    /**
     * Questions count.
     */
    private static final int ROUNDS_COUNT = 3;

    /**
     * User input field.
     */
    private static final Scanner USER_INPUT = new Scanner(System.in);

    /**
     * Name user.
     */
    private static String userName;

    /**
     * @param description rules of the game.
     * @param gameQuestions list of questions with correct answers.
     */
    public static void runGame(final String description,
                               final String[][] gameQuestions) {
        greetUser();
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

    /**
     * Greeting user.
     */
    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = USER_INPUT.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    /**
     * @return the count of rounds.
     */
    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }

    /**
     * @return a random number from 0 to 100.
     */
    public static int getRandomNumbers() {
        return RANDOM_NUMBERS;
    }

    private GameEngine() {

    }
}
