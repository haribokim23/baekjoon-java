package p11xxx.p11047;

// 제목 : 동전 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        int coins = 0;

        for (int i = n - 1; i >= 0; i--) {
            int value = a[i];
            int count = k / value;
            k -= value * count;
            coins += count;
        }

        System.out.println(coins);
    }
}
