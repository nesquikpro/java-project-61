package hexlet.code;


import hexlet.code.games.EvenGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;


import java.util.Scanner;

public final class App {
    private App() {

    }

    /**
     * Entry point of the Brain Games Application.
     * @param args arguments not used.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");

        boolean running = true;
        while (running) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            if (!scanner.hasNextInt()) {
                return;
            }

            String userChoice = scanner.nextLine();
            System.out.println();

            switch (userChoice) {
                case "0":
                    running = false;
                    break;
                case "1":
                    break;
                case "2":
                    EvenGame.startGame();
                    break;
                case "3":
                    CalculatorGame.startGame();
                    break;
                case "4":
                    GcdGame.startGame();
                    break;
                case "5":
                    ProgressionGame.startGame();
                    break;
                case "6":
                    PrimeGame.startGame();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    System.out.println();
                    break;
            }
        }
    }
}
