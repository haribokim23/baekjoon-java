package p04xxx.p04796;

// 제목 : 캠핑

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; true; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());

            if (l == 0) {
                break;
            }

            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            System.out.println("Case " + i + ": " + (v / p * l + Math.min(v % p, l)));
        }

        br.close();
    }
}
