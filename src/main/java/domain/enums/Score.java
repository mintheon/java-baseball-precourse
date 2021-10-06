package domain.enums;

public enum Score {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private String name;

    Score(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
