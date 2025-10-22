package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class EvenGame {
    /**
    * Max random number.
    */
    private static final int MAX_RANDOM_NUMBER = 100;
    /**
     * Questions count.
     * */
    private static final int QUESTION_COUNT = 3;

    private EvenGame() {

    }
    /**
     * Prompts the user for their name and prints a greeting.
     */
    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, "
                + "otherwise answer 'no'");
        Random newRandom = new Random();

        int count = 0;
        while (count < QUESTION_COUNT) {
            int randomNumber = newRandom.nextInt(MAX_RANDOM_NUMBER);
            System.out.println("Question: " + randomNumber);

            System.out.print("Your answer: ");
            String userRep = sc.nextLine();

            if (userRep.equalsIgnoreCase("yes") && checkEven(randomNumber)) {
                System.out.println("Correct!");
                count++;
            } else if (userRep.equalsIgnoreCase("no")
                    && !checkEven(randomNumber)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'yes' is wrong answer ;(. "
                        + "Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        sc.close();
    }

    /**
     * Checking if a number is even.
     * @param randomNumber
     * @return true if the number is even, false otherwise
     */
    public static boolean checkEven(final int randomNumber) {
        if (randomNumber % 2 == 0) {
            return true;
        }
        return false;
    }
}
