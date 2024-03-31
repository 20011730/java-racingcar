package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class CarTest {
    @DisplayName("랜덤 숫자가 0~3일 때는 움직이지 않음")
    @ParameterizedTest
    @CsvSource(value = {"0,0", "1,0", "2,0", "3,0"})
    void 움직이지_않음(int number, int position) {
        
    }

    @DisplayName("랜덤 숫자가 4~9일 때는 움직임")
    @ParameterizedTest
    @CsvSource(value = {"4,1", "5,1", "6,1", "7,1", "8,1", "9,1"})
    void 움직임(int number, int distance) {

    }
}
