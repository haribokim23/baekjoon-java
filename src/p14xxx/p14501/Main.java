package p14xxx.p14501;

// 제목 : 퇴사

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = i + Integer.parseInt(st.nextToken());

            if (t <= n) {
                prices[t] = Math.max(prices[t], prices[i] + Integer.parseInt(st.nextToken()));
            }

            prices[i + 1] = Math.max(prices[i], prices[i + 1]);
        }

        br.close();
        System.out.println(prices[n]);
    }
}
