package p11xxx.p11660;

// 제목 : 구간 합 구하기 5

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] sums = new int[n + 1][n + 1];

        for (int x = 1; x <= n; x++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int y = 1; y <= n; y++) {
                sum += Integer.parseInt(st.nextToken());
                sums[y][x] = sum;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int sum = 0;

            for (int x = x1; x <= x2; x++) {
                sum += sums[y2][x] - sums[y1 - 1][x];
            }

            sb.append(sum).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
