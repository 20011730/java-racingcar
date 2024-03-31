package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarsTest {
    @DisplayName("자동차 이름이 중복되면 예외 처리")
    @ParameterizedTest
    @CsvSource(value = {"1", "1", "2"})
    void 차량_이름_중복(int size) {

    }
}
