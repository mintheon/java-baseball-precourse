package baseball.enums;

public enum Score {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String name;

    Score(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isNotNothing() {
        return this != NOTHING;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
