package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public final class EvenGame extends Game {
    /**
     * Start Even Game.
     */
    @Override
    public void startGame() {
        super.startGame();
        Random rnd = new Random();
        for (int i = 0; i < QUESTION_COUNT; i++) {
            int randomNumber = rnd.nextInt(MAX_RANDOM_NUMBER);
            System.out.println("Question: " + randomNumber);

            System.out.print("Your answer: ");
            String userReply = USER_INPUT.nextLine();
            String checkedEven = checkEven(randomNumber) ? "yes" : "no";

            if (userReply.equalsIgnoreCase(checkedEven)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userReply + "' is wrong answer ;(. "
                        + "Correct answer was '" + checkedEven + "'.");
                System.out.println("Let's try again, " + getUserName() + "!");
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
            System.out.println("Answer 'yes' if the number is even, "
                    + "otherwise answer 'no'");
    }

    /**
     * Checking if a number is even.
     * @param randomNumber random number.
     * @return true if the number is even, false otherwise.
     */
    public static boolean checkEven(final int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
