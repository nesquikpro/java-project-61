package hexlet.code;

import hexlet.code.interfaces.GameInterface;

import java.util.Random;
import java.util.Scanner;

public abstract class Game implements GameInterface {
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
     * Starting game.
     */
    @Override
    public void startGame() {
        greetUser();
        printRules();
    }

    /**
     * Printing rules for game.
     */
    @Override
    public void printRules() {
    }

    /**
     * Congratulate user.
     */
    @Override
    public void congratulateUser() {
        System.out.println("Congratulations, " + getUserName() + "!");
        System.out.println();
    }

    /**
     * Get User.
     * @return user
     */
    protected String getUserName() {
        return userName;
    }

    protected Game() {
    }
}
