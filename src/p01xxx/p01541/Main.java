package p01xxx.p01541;

// 제목 : 잃어버린 괄호

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String equation = br.readLine();
        br.close();
        int sum = 0;
        int value = 0;
        int sign = 1;

        for (int i = 0; i < equation.length(); i++) {
            char character = equation.charAt(i);

            if (character == '+') {
                sum += value * sign;
                value = 0;
                continue;
            }

            if (character == '-') {
                sum += value * sign;
                value = 0;
                sign = -1;
                continue;
            }

            value = value * 10 + character - '0';
        }

        System.out.println(sum + value * sign);
    }
}
