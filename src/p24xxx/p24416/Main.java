package p24xxx.p24416;

// 제목 : 알고리즘 수업 - 피보나치 수 1

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int recCount;
    private static int dpCount;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        recCount = 0;
        dpCount = 0;

        rec(n);
        dp(n);
        System.out.println(recCount + " " + dpCount);
    }

    private static int rec(int n) {
        if (n == 1 || n == 2) {
            recCount++;
            return 1;
        }

        return rec(n - 1) + rec(n - 2);
    }

    private static void dp(int n) {
        for (int i = 3; i <= n; i++) {
            dpCount++;
        }
    }
}
