package p09xxx.p09184;

// 제목 : 신나는 함수 실행

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        memo = new int[101][101][101];
        memo[50][50][50] = 1;
        memo[70][70][70] = w(20, 20, 20);

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            sb.append("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");
        }

        br.close();
        System.out.print(sb);
    }

    private static int w(int a, int b, int c) {
        int peek;

        if (a <= 0 || b <= 0 || c <= 0) {
            peek = memo[50][50][50];
        } else if (a > 20 || b > 20 || c > 20) {
            peek = memo[70][70][70];
        } else {
            peek = memo[a + 50][b + 50][c + 50];
        }

        if (peek == 0) {
            if (a < b && b < c) {
                peek = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            } else {
                peek = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1,
                        c - 1);
            }
        }

        return memo[a + 50][b + 50][c + 50] = peek;
    }
}
