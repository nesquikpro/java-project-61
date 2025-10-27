package hexlet.code;

import hexlet.code.interfaces.IGame;

import java.util.Random;
import java.util.Scanner;

public abstract class Game implements IGame {
    /**
     * Max random number.
     */
    protected static final int MAX_RANDOM_NUMBER = 100;

    /**
     * Get random numbers.
     */
    protected static final Random RANDOM = new Random();

    /**
     * Questions count.
     * */
    protected static final int QUESTION_COUNT = 3;

    /**
     * Username.
     */
    private String userName;

    /**
     * User input.
     */
    protected static final Scanner USER_INPUT = new Scanner(System.in);

    /**
     * Starting game.
     */
    @Override
    public void startGame() {
        greetUser();
        printRules();

        for (int i = 0; i < QUESTION_COUNT; i++) {
            String question = generateQuestion();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = USER_INPUT.nextLine();

            if (!isCorrectAnswer(userAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + getCorrectAnswer() + "'.");
                System.out.println("Let's try again, " + getUserName() + "!");
                System.exit(0);
            } else {
                System.out.println("Correct!");
            }
        }

        System.out.println("Congratulations, " + getUserName() + "!");
        System.out.println();
    }

    /**
     * Greeting User.
     */
    @Override
    public void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = USER_INPUT.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    /**
     * Printing rules for game.
     */
    @Override
    public abstract void printRules();

    /**
     * Get User.
     * @return user
     */
    protected String getUserName() {
        return userName;
    }
    /**
     * Get game question.
     * @return game question.
     */
    public abstract String generateQuestion();

    /**
     * Check if User answer is true.
     * @param userAnswer user answer.
     * @return check if user answer is true.
     */
    public abstract boolean isCorrectAnswer(String userAnswer);

    /**
     * Get true answer.
     * @return true answer.
     */
    public abstract String getCorrectAnswer();

    protected Game() {
    }
}
