package baseball.domain;

import baseball.enums.Error;

public class BallNumber {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 9;

    private final int number;

    public BallNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException(Error.WRONG_INPUT.message());
        }

        this.number = number;
    }
}
