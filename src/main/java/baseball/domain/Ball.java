package baseball.domain;

import baseball.enums.Score;

public class Ball {
    private final int position;
    private final BallNumber number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = new BallNumber(number);
    }

    public Score check(Ball target) {
        if (this.equals(target)) {
            return Score.STRIKE;
        }

        if (target.number.getValue() == number.getValue()) {
            return Score.BALL;
        }

        return Score.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !(o instanceof Ball)) {
            return false;
        }

        Ball target = (Ball) o;

        return position == target.position && number.getValue() == target.number.getValue();
    }
}
