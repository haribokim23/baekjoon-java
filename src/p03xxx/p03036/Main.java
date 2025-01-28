package p03xxx.p03036;

// 제목 : 링

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int first = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());
            int gcd = getGCD(Math.max(first, current), Math.min(first, current));
            sb.append(first / gcd).append("/").append(current / gcd).append("\n");
        }

        System.out.println(sb);
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
