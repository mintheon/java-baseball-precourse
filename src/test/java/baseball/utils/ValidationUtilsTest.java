package baseball.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationUtilsTest {

    @Test
    void 숫자_범위_검증() {
        assertThat(ValidationUtils.isCorrectRangeNumber(1)).isTrue();
        assertThat(ValidationUtils.isCorrectRangeNumber(9)).isTrue();
        assertThat(ValidationUtils.isCorrectRangeNumber(0)).isFalse();
        assertThat(ValidationUtils.isCorrectRangeNumber(10)).isFalse();
    }
}
