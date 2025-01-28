package p02xxx.p02445;

// 제목 : 별 찍기 - 8

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < N - Math.abs(N - i - 1); j++) {
                sb.append("*");
            }
            for (int j = 0; j < 2 * Math.abs(i - N + 1); j++) {
                sb.append(" ");
            }
            for (int j = 0; j < N - Math.abs(N - i - 1); j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
