package p11xxx.p11057;

// 제목 : 오르막 수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[] counts = new int[10];
        Arrays.fill(counts, 1);

        while (n-- > 1) {
            for (int i = 0; i < 10; i++) {
                int sum = 0;

                for (int j = i; j < 10; j++) {
                    sum += counts[j];
                    sum %= 10007;
                }

                counts[i] = sum;
            }
        }

        int sum = 0;

        for (int count : counts) {
            sum += count;
            sum %= 10007;
        }

        System.out.println(sum);
    }
}
