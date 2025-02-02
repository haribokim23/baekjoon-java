package p02xxx.p02003;

// 제목 : 수들의 합 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        int[] sums = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int start = 0, end = 1; end < n + 1; ) {
            int sum = sums[end] - sums[start];

            if (sum < m) {
                end++;
                continue;
            }

            if (sum == m) {
                count++;
            }

            start++;
        }

        System.out.println(count);
    }
}
