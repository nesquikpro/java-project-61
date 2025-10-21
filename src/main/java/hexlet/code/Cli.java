package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private Cli() {

    }

    /**
     * Prompts the user for their name and prints a greeting.
     */
    public static void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        System.out.print("Hello, " + name + "!");
        sc.close();
    }
}
