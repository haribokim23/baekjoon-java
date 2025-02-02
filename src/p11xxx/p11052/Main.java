package p11xxx.p11052;

// 제목 : 카드 구매하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] maxes = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int max = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= i / 2; j++) {
                max = Math.max(max, maxes[j] + maxes[i - j]);
            }

            maxes[i] = max;
        }

        System.out.println(maxes[n]);
    }
}
