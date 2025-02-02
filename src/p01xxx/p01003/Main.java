package p01xxx.p01003;

// 제목 : 피보나치 함수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] cache = new int[41][2];

        for (int i = 0, prev = 0, curr = 1; i < 41; i++) {
            cache[i][0] = curr - prev;
            cache[i][1] = prev;

            curr += prev;
            prev = curr - prev;
        }

        cache[0][0] = 1;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            sb.append(cache[n][0]).append(" ").append(cache[n][1]).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
