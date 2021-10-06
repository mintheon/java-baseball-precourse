package baseball.domain;

import baseball.enums.Score;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {

    @Test
    void 스트라이크_검증() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));

        Score score = balls.check(new Ball(1, 1));
        assertThat(score).isEqualTo(Score.STRIKE);
    }

    @Test
    void 볼_검증() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));

        Score score = balls.check(new Ball(2, 3));
        assertThat(score).isEqualTo(Score.BALL);
    }

    @Test
    void 나싱_검증() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));

        Score score = balls.check(new Ball(3, 5));
        assertThat(score).isEqualTo(Score.NOTHING);
    }
}
