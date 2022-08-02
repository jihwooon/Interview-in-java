package Interview.in.Java;

import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("Text_Study 클래스")
public class Text_Study {

    public String solution(String str) {
        str = str.toUpperCase();
        String pattern = "^[a-zA-Z]*$";

        // 같은 문자가 여러개 이상 나오면 출력한다.
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'Z') {
                return "Z";
            }

        }

        return str;
    }


    @Nested
    @DisplayName("설명할 테스트 대상을 명시한다.")
    class Describe_of {
        @Nested
        @DisplayName("테스트 대상이 놓인 상황을 설명한다.")
        class Context_with_real {
            @Test
            @DisplayName("테스트 대상의 행동을 설명한다.")
            void it_returns_a_valid_complex() {

              assertThat(solution("z")).isEqualTo("Z");
                assertThat(solution("baaa")).isEqualTo("A");
                assertThat(solution("zZa")).isEqualTo("Z");

            }
        }
    }
}
