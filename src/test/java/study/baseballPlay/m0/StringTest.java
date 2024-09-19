package study.baseballPlay.m0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    @DisplayName("Test example")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("Test addition of case1")
    void replaceCase1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");

        actual = "1".split(",");
        assertThat(actual).containsExactly("1");

    }

    @Test
    @DisplayName("Test addition of case2")
    void replaceCase2() {
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).contains("1,2");
    }

    @Test
    @DisplayName("Test addition of case3")
    void replaceCase3() {
        Character actual = "abcd".charAt(1);
        assertThat(actual).isEqualTo('b');

        assertThatThrownBy(() -> {
            "abcd".charAt(6);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("Index 6");

        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            "abcd".charAt(6);
        });
    }
}
