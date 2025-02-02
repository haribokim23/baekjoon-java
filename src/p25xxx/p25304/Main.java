package p25xxx.p25304;

// 제목 : 영수증

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        System.out.println(x == total ? "Yes" : "No");
        br.close();
    }
}
