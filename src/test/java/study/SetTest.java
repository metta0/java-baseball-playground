package study;

import org.assertj.core.internal.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Case 1")
    void sizeCheck() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("Case 2")
    @ValueSource(ints = { 1, 2, 3 }) // six numbers
    void contains(int number) {
        assertTrue(numbers.contains(number));
    }

    @ParameterizedTest
    @CsvSource(value = { "1:True", "2:True", "3:True", "4:False","5:False" }, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(int input, Boolean expected) {
        assertEquals(expected, numbers.contains(input));
    }

    // Test Case 구현
}
