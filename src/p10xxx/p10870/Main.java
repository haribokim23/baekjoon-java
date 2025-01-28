package p10xxx.p10870;

// 제목 : 피보나치 수 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;

        n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(fibonacci(n));

    }

    private static int fibonacci(int n) {
        int value;

        if (n == 0) {
            value = 0;
        } else if (n == 1) {
            value = 1;
        } else {
            value = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return value;
    }
}
