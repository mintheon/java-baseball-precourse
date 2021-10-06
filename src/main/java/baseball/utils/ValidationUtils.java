package baseball.utils;

public class ValidationUtils {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 9;

    public static boolean isCorrectRangeNumber(int number) {
        return number >= MIN_NUMBER && number <= MAX_NUMBER;
    }
}
