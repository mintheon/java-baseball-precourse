package baseball.enums;

public enum Error {
    WRONG_INPUT("각 자리의 숫자는 1~9사이의 중복되지 않은 세자리 숫자만 입력할 수 있습니다.");

    String message;

    Error(String message) {
        String header = "[ERROR]";

        this.message = header + message;
    }

    public String message() {
        return message;
    }
}
