package p01xxx.p01246;

// 제목 : 온라인 판매

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] p = new int[m];

        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(p);
        int maxPrice = 0;
        int maxProfit = 0;

        for (int i = 0; i < m; i++) {
            int price = p[i];
            int profit = price * Math.min(m - i, n);

            if (profit > maxProfit) {
                maxPrice = price;
                maxProfit = profit;
            }
        }

        System.out.println(maxPrice + " " + maxProfit);
    }
}
