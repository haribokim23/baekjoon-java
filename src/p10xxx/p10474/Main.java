package p10xxx.p10474;

// 제목 : 분수좋아해?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (n + d != 0) {
            sb.append(n / d).append(" ").append(n % d).append(" / ").append(d).append("\n");

            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
        }

        br.close();
        System.out.print(sb);
    }
}
