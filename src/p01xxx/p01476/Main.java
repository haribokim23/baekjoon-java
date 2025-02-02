package p01xxx.p01476;

// 제목 : 날짜 계산

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int year = 1; ; year++) {
            int earth = (year - 1) % 15 + 1;
            int sun = (year - 1) % 28 + 1;
            int moon = (year - 1) % 19 + 1;

            if (earth == e && sun == s && moon == m) {
                System.out.println(year);
                break;
            }
        }
    }
}
