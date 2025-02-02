package p02xxx.p02441;

// 제목 : 별 찍기 - 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), I = N, P, T;
        br.close();
        StringBuilder sb = new StringBuilder();

        while (I > 0) {
            P = N - I;
            T = I--;

            while (P-- > 0) {
                sb.append(" ");
            }
            while (T-- > 0) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
