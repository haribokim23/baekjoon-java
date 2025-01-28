package p02xxx.p02440;

// 제목 : 별 찍기 - 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), M;
        br.close();
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            M = N--;

            while (M-- > 0) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
