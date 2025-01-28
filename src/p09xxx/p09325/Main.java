package p09xxx.p09325;

// 제목 : 얼마?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), price, n;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            price = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                price += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }

            sb.append(price).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
