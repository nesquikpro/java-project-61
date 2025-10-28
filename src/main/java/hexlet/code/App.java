package  hexlet.code;

import hexlet.code.game.*;

import java.util.Scanner;

public final class App {
    private App() {

    }

    /**
     * Entry point of the Brain Games Application.
     * @param args args.
     */
    public static void main(final String[] args) {
        boolean running = true;
        while (running) {
            Scanner in = new Scanner(System.in);

            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            String userChoice = in.nextLine();
            System.out.println();

            switch (userChoice) {
                case "0":
                    running = false;
                    break;
                case "1":
                    break;
                case "2":
                    Even evenGame = new Even();
                    evenGame.startGame();
                    break;
                case "3":
                    Calculator calcGame = new Calculator();
                    calcGame.startGame();
                    break;
                case "4":
                    Gcd gcdGame = new Gcd();
                    gcdGame.startGame();
                    break;
                case "5":
                    Progression progression = new Progression();
                    progression.startGame();
                    break;
                case "6":
                    Prime prime = new Prime();
                    prime.startGame();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
