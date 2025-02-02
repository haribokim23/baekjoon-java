package p11xxx.p11729;

// 제목 : 하노이 탑 이동 순서

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(
                hanoi(n, 1, 3, new StringBuilder().append((int) Math.pow(2, n) - 1).append("\n")));
    }

    private static StringBuilder hanoi(int n, int from, int to, StringBuilder sb) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
        } else {
            sb = hanoi(n - 1, from, 6 - from - to, sb);
            sb = hanoi(1, from, to, sb);
            sb = hanoi(n - 1, 6 - from - to, to, sb);
        }

        return sb;
    }
}
