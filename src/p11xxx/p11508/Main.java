package p11xxx.p11508;

// 제목 : 2+1 세일

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(c);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) {
                sum += c[n - i];
            }
        }

        System.out.println(sum);
    }
}
