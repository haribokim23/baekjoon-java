package p02xxx.p02156;

// 제목 : 포도주 시식

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] volumes = new int[n];
        volumes[0] = Integer.parseInt(br.readLine());
        int[][] sums = new int[n][3];
        sums[0][1] = volumes[0];

        if (n == 1) {
            System.out.println(sums[0][1]);
            return;
        }

        volumes[1] = Integer.parseInt(br.readLine());
        sums[1][0] = sums[0][1] + volumes[1];
        sums[1][1] = volumes[1];
        sums[1][2] = sums[0][1];

        if (n == 2) {
            System.out.println(sums[1][0]);
            return;
        }

        for (int i = 2; i < n; i++) {
            volumes[i] = Integer.parseInt(br.readLine());
            sums[i][0] = sums[i - 1][1] + volumes[i];
            sums[i][1] = max(sums[i - 2][0], sums[i - 2][1], sums[i - 1][2]) + volumes[i];
            sums[i][2] = max(sums[i - 2][0], sums[i - 2][1], sums[i - 1][0], sums[i - 1][1]);
        }

        br.close();
        System.out.println(max(sums[n - 1][0], sums[n - 1][1], sums[n - 1][2]));
    }

    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    private static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}
