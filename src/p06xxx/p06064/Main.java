package p06xxx.p06064;

// 제목 : 카잉 달력

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken()) % m;

            int large = Math.max(n, m);
            int small = Math.min(n, m);
            int product = large * small;

            for (int remainder = large % small; remainder > 0; remainder = large % small) {
                large = small;
                small = remainder;
            }

            boolean found = false;

            for (int year = x; year <= product / small; year += n) {
                if (year % m == y) {
                    sb.append(year);
                    found = true;
                    break;
                }
            }

            if (!found) {
                sb.append(-1);
            }

            sb.append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
