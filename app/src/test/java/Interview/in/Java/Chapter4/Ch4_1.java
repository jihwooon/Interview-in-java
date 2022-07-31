package Interview.in.Java.Chapter4;

/*
* 2진수의 패리티는 1로 세팅된 비트의 개수와 같다. 즉 1이 홀수 개이면, 1, 짝수 개이면 0이된다.
* 예를 들어 1011의 패리티는 1이 되고, 10001000의 패리티는 0이 된다. 이 파리티는 데이터를 저장하거나 네으퉈크로 통신을 할 때 오류를 확인하는 용도로 사용된다.
* 64비트 숫자 하나의 패리티를 계산하는 코드는 쉽게 작성할 수 있다.
* 64비트로 이루어진 숫자가 굉장히 많다면, 패리티를 어떻게 계산해야 할까?
* */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ch4_1 {

    public short solution(int x) {
        short result = 0;
        while(x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }

        return result;
    }

    @Nested
    @DisplayName("2진수의 패리티의 1로 세팅된 비트의 개수가")
    class Describe_of {

        @Nested
        @DisplayName("1이 홀수 개이면")
        class Context_with_odd_number {
          @Test
          @DisplayName("결과 값이 1을 리턴한다.")
          void it_returns_a_valid_one() {
              assertThat(solution(1101)).isEqualTo((short) 1);
          }
        }

        @Nested
        @DisplayName("1이 짝수 개이면")
        class Context_with_even_number {
            @Test
            @DisplayName("결과 값이 0을 리턴한다.")
            void it_returns_a_valid_zero() {
                assertThat(solution(1111)).isEqualTo((short) 0);
            }
        }
    }
}
