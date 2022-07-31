package Interview.in.Java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/*
 * 문자 찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력 받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 입력
 *   - 첫 줄에 문자열이 주어지고, 두 번째에 문자가 주어진다.
 * 출력
 *   - 첫 줄에 해당 문자의 개수를 출력한다.
 * */

@DisplayName("Text_Search 클래스")
public class Text_Search {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }

        return answer;
    }

    @Nested
    @DisplayName("solution 메서드는")
    class Describe_of {

        @Nested
        @DisplayName("첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어지면")
        class Context_with_real {
            @Test
            @DisplayName("첫 줄에 해당 문자의 개수를 출력한다.")
            void it_returns_a_valid_complex() {

                assertThat(solution("Computercooler", 'c')).isEqualTo(2);
                assertThat(solution("abcsetasasvb", 'a')).isEqualTo(3);
                assertThat(solution("banana", 'n')).isEqualTo(2);

            }
        }
    }

}
