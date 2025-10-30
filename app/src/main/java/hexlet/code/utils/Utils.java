package hexlet.code.utils;

import java.util.Random;

public class Utils {
    private static Random random = new Random();

    private static final int DEFAULT_MIN = 0;

    private static final int DEFAULT_MAX = 100;

    public static int getDefaultRandomNumber() {
        return random.nextInt(DEFAULT_MAX - DEFAULT_MIN + 1) + DEFAULT_MIN;
    }

    public static int getRandomNumberFromRange(int max) {
        return random.nextInt(max - DEFAULT_MIN + 1) + DEFAULT_MIN;
    }
}
