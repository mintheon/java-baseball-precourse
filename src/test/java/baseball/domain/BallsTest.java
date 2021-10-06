package baseball.domain;

import baseball.enums.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {
    Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void 스트라이크_검증() {
        Score score = balls.check(new Ball(1, 1));
        assertThat(score).isEqualTo(Score.STRIKE);
    }

    @Test
    void 볼_검증() {
        Score score = balls.check(new Ball(2, 3));
        assertThat(score).isEqualTo(Score.BALL);
    }

    @Test
    void 나싱_검증() {
        Score score = balls.check(new Ball(3, 5));
        assertThat(score).isEqualTo(Score.NOTHING);
    }

    @DisplayName("스트라이크_개수_검증")
    @ParameterizedTest(name = "{displayName}_{3} Strike")
    @CsvSource({"1, 2, 3, 3", "1, 2, 4, 2", "1, 4, 5, 1", "4, 5, 6, 0"})
    void 스트라이크_개수_검증(int number1, int number2, int number3, int answer) {
        Result result = balls.check(Arrays.asList(number1, number2, number3));
        assertThat(result.countStrike()).isEqualTo(answer);
    }

    @DisplayName("볼_개수_검증")
    @ParameterizedTest(name = "{displayName}_{3} Ball")
    @CsvSource({"3, 1, 2, 3", "3, 1, 4, 2", "4, 5, 2, 1", "4, 5, 6, 0"})
    void 볼_개수_검증(int number1, int number2, int number3, int answer) {
        Result result = balls.check(Arrays.asList(number1, number2, number3));
        assertThat(result.countBall()).isEqualTo(answer);
    }

    @DisplayName("나싱_개수_검증")
    @ParameterizedTest(name = "{displayName}_Nothing")
    @CsvSource({"3, 1, 2"})
    void 나싱_개수_검증(int number1, int number2, int number3) {
        Result result = balls.check(Arrays.asList(4, 5, 6));
        assertThat(result.countStrike()).isEqualTo(0);
        assertThat(result.countBall()).isEqualTo(0);
    }
}
