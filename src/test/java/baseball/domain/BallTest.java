package baseball.domain;

import baseball.enums.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {
    private Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(1, 5);
    }

    @Test
    void 스트라이크_검증() {
        Score status = ball.check(new Ball(1, 5));

        assertThat(status).isEqualTo(Score.STRIKE);
    }

    @Test
    void 볼_검증() {
        Score status = ball.check(new Ball(2, 5));

        assertThat(status).isEqualTo(Score.BALL);
    }

    @Test
    void 나싱_검증() {
        Score status = ball.check(new Ball(3, 8));

        assertThat(status).isEqualTo(Score.NOTHING);
    }
}
