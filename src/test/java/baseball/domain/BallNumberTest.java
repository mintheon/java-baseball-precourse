package baseball.domain;

import baseball.enums.Error;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BallNumberTest {

    @Test
    void 숫자_범위_검증() {
        assertDoesNotThrow(() -> new BallNumber(1));

        assertDoesNotThrow(() -> new BallNumber(9));

        assertThatThrownBy(() -> new BallNumber(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Error.WRONG_INPUT.message());

        assertThatThrownBy(() -> new BallNumber(10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Error.WRONG_INPUT.message());
    }
}
