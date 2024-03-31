package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class TryCountTest {
    @DisplayName("시도 횟수가 양의 정수면 유효")
    @ParameterizedTest
    @CsvSource(value = {"1", "10", "100", "1000"})
    void 시도_횟수_양수(int number) {

    }

    @DisplayName("시도 횟수가 0 이하 혹은 음수면 예외를 던진다")
    @ParameterizedTest
    @CsvSource(value = {"0", "-1", "-100", "-1000"})
    void 시도_횟수_음수(int number) {

    }
}
