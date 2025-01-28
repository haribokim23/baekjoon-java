package p09xxx.p09095;

// 제목 : 1, 2, 3 더하기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] memo = new int[11];
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;

        for (int i = 4; i < 11; i++) {
            memo[i] = memo[i - 3] + memo[i - 2] + memo[i - 1];
        }

        while (t-- > 0) {
            System.out.println(memo[Integer.parseInt(br.readLine())]);
        }

        br.close();
    }
}
