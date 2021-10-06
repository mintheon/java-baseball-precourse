package baseball.domain;

import baseball.enums.Score;

public class Result {
    private int strikeCount;
    private int ballCount;

    public Result() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    public Integer countStrike() {
        return strikeCount;
    }

    public Integer countBall() {
        return ballCount;
    }

    public void report(Score score) {
        if (score.isStrike()) {
            strikeCount++;
        }

        if (score.isBall()) {
            ballCount++;
        }
    }
}
