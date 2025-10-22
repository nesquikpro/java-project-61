package  hexlet.code;

import java.util.Scanner;

public final class App {
    private App() {

    }

    /**
     * Entry point of the Brain Games Application.
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner inputGameNumber = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choiceNumber = inputGameNumber.nextLine();

        switch (choiceNumber) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    break;
                case "2":
                    System.out.println("Welcome to the Brain Games!");
                    EvenGame.startGame();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
        }
    }
}
