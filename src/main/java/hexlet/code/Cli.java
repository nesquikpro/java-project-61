package hexlet.code;

import java.util.Scanner;

public class Cli{

    private Cli(){

    }

    public static void getName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        System.out.print("Hello, " + name + "!");
        sc.close();
    }
}