package p25xxx.p25576;

// 제목 : 찾았다 악질

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] viewers = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            viewers[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum += Math.abs(viewers[j] - Integer.parseInt(st.nextToken()));
            }

            if (sum > 2000) {
                count++;
            }
        }

        br.close();
        System.out.println(count > (n - 2) / 2.0 ? "YES" : "NO");
    }
}
