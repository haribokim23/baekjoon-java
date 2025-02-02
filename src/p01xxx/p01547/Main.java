package p01xxx.p01547;

// 제목 : 공

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()), x, y, i = 0, j = 0;
        int[] cups = {-1, 1, 2, 3};
        StringTokenizer st;

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for (int c = 1; c < cups.length; c++) {
                if (cups[c] == x) {
                    i = c;
                }
                if (cups[c] == y) {
                    j = c;
                }
            }

            cups[0] = cups[i];
            cups[i] = cups[j];
            cups[j] = cups[0];
        }

        br.close();
        System.out.println(cups[1]);
    }
}
