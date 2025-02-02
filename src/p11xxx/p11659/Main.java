package p11xxx.p11659;

// 제목 : 구간 합 구하기 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] memo = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1, sum = 0; i <= n; i++) {
            sum += Integer.parseInt(st.nextToken());
            memo[i] = sum;
        }

        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());

            sb.append(-memo[Integer.parseInt(st.nextToken()) - 1] + memo[Integer.parseInt(
                    st.nextToken())]).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
