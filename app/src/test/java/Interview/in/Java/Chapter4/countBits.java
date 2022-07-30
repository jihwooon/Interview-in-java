package Interview.in.Java.Chapter4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class countBits {

    private static short solution(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits;
    }

    @Test
    void result() {
        assertThat(solution(5)).isEqualTo((short) 2);
        assertThat(solution(100)).isEqualTo((short) 3);
        assertThat(solution(500)).isEqualTo((short) 6);

    }

    public static void main(String[] args) {
        short solution = solution(100);

        System.out.println("solution = " + solution);
    }


}
