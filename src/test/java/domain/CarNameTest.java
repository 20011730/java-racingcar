package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarNameTest {
    @DisplayName("차량 이름은 1~5자 사이여야 한다")
    @ParameterizedTest
    @CsvSource(value = {"'', 차량 이름이 존재해야 합니다.",
            "123456, 차량 이름은 5글자 이하여야 합니다.",
            "123456789, 이름은 5글자 이하여야 합니다."})

    void 이름_예외_발생(String carName, String errorMessage) {
        assertThatThrownBy(() -> new CarName(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(errorMessage);
    }

    @DisplayName("1~5글자 이름은 유효")
    @ParameterizedTest
    @CsvSource(value = {"1", "123", "123", "1234"})
    void 유효한_이름(String carName) {
        assertThatCode(() -> new CarName(carName))
                .doesNotThrowAnyException();
    }
}
