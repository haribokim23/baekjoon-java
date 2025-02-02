package p09xxx.p09461;

// 제목 : 파도반 수열

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[] p = new long[100];
        p[0] = 1;
        p[1] = 1;
        p[2] = 1;
        p[3] = 2;
        p[4] = 2;

        for (int i = 5; i < p.length; i++) {
            p[i] = p[i - 1] + p[i - 5];
        }

        while (t-- > 0) {
            System.out.println(p[Integer.parseInt(br.readLine()) - 1]);
        }

        br.close();
    }
}
