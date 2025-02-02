package p01xxx.p01059;

// 제목 : 좋은 구간

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();
        int min = 0;
        int max = 1001;

        while (l-- > 0) {
            int s = Integer.parseInt(st.nextToken());

            if (s == n) {
                System.out.println(0);
                return;
            } else if (s < n) {
                min = Math.max(min, s);
            } else {
                max = Math.min(max, s);
            }
        }

        System.out.println((max - n) * (n - min) - 1);
    }
}
