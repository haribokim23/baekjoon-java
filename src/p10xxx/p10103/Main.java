package p10xxx.p10103;

// 제목 : 주사위 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), c = 100, s = 100, a, b;
        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a < b) {
                c -= b;
            } else if (b < a) {
                s -= a;
            }
        }

        br.close();
        System.out.println(c + "\n" + s);
    }
}
