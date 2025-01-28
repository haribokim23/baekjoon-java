package p02xxx.p02485;

// 제목 : 가로수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(trees);

        int[] distances = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            distances[i] = trees[i + 1] - trees[i];
        }

        int min = distances[0];

        for (int i = 1; i < n - 1; i++) {
            min = gcd(min, distances[i]);
        }

        System.out.println((trees[n - 1] - trees[0]) / min - n + 1);
    }

    private static int gcd(int a, int b) {
        int r = b % a;

        while (r > 0) {
            b = a;
            a = r;
            r = b % a;
        }

        return a;
    }
}
