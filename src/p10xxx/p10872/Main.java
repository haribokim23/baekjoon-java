package p10xxx.p10872;

// 제목 : 팩토리얼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;

        N = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(factorial(N));

    }

    private static int factorial(int N) {
        int value;

        value = 1;

        if (N > 0) {
            value = N * factorial(N - 1);
        }

        return value;
    }
}
