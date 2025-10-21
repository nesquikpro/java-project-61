package  hexlet.code;

public final class App {
    private App() {

    }

    /**
     * Entry point of the Brain Games Application.
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Cli.getName();
    }
}
