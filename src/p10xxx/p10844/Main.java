package p10xxx.p10844;

// 제목 : 쉬운 계단 수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[] counts = new int[10];
        Arrays.fill(counts, 1, 10, 1);

        while (n-- > 1) {
            int[] temp = new int[10];

            for (int i = 0; i < 10; i++) {
                if (i > 0) {
                    temp[i] += counts[i - 1];
                }

                if (i < 9) {
                    temp[i] += counts[i + 1];
                }

                temp[i] %= 1_000_000_000;
            }

            counts = temp;
        }

        int sum = 0;

        for (int count : counts) {
            sum += count;
            sum %= 1_000_000_000;
        }

        System.out.println(sum);
    }
}
