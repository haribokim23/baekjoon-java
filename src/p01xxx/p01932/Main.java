package p01xxx.p01932;

// 제목 : 정수 삼각형

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] maxSums = new int[n];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] sums = new int[i];

            for (int j = 0; j < i; j++) {
                int number = Integer.parseInt(st.nextToken());

                if (j == 0) {
                    sums[j] = maxSums[j] + number;
                    continue;
                }

                sums[j] = Math.max(maxSums[j - 1], maxSums[j]) + number;
            }

            System.arraycopy(sums, 0, maxSums, 0, i);
        }

        br.close();
        int max = 0;

        for (int sum : maxSums) {
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
