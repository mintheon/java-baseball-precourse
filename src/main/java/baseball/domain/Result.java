package baseball.domain;

import baseball.enums.Score;

public class Result {
    private final String EMPTY_TEXT = "";

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

    public void print() {
        String resultMessage = String.format("%s %s %s",
                strikeMessage(),
                ballMessage(),
                nothingMessage());

        System.out.println(resultMessage.trim());
    }

    public String strikeMessage() {
        if (strikeCount == 0) {
            return EMPTY_TEXT;
        }

        return String.format("%d%s", strikeCount, Score.STRIKE.getName());
    }

    public String ballMessage() {
        if (ballCount == 0) {
            return EMPTY_TEXT;
        }

        return String.format("%d%s", ballCount, Score.BALL.getName());
    }

    public String nothingMessage() {
        if (strikeCount > 0 || ballCount > 0) {
            return EMPTY_TEXT;
        }

        return Score.NOTHING.getName();
    }
}
