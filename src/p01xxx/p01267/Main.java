package p01xxx.p01267;

// 제목 : 핸드폰 요금

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), y = 0, m = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (n-- > 0) {
            int t = Integer.parseInt(st.nextToken());
            y += (t / 30 + 1) * 10;
            m += (t / 60 + 1) * 15;
        }

        br.close();
        System.out.println(y < m ? "Y " + y : m < y ? "M " + m : "Y M " + y);
    }
}
