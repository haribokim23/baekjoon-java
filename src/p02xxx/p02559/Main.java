package p02xxx.p02559;

// 제목 : 수열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        int[] sums = new int[n + 1];
        int max = -10_000_000;

        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + Integer.parseInt(st.nextToken());

            if (i >= k) {
                max = Math.max(max, sums[i] - sums[i - k]);
            }
        }

        System.out.println(max);
    }
}
