package hexlet.code.utils;

import java.util.Scanner;

public final class Cli {
    public static String greet() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = userInput.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
