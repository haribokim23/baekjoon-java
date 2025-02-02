package p11xxx.p11050;

// 제목 : 이항 계수 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N, K;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(factorial(N) / factorial(K) / factorial(N - K));

    }

    private static int factorial(int N) {
        int value;

        value = 1;

        if (N > 1) {
            value = N * factorial(N - 1);
        }

        return value;
    }
}
