package p05xxx.p05361;

// 제목 : 전투 드로이드 가격

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.00");

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            sb.append("$").append(df.format(
                    350.34 * Integer.parseInt(st.nextToken()) + 230.90 * Integer.parseInt(
                            st.nextToken()) + 190.55 * Integer.parseInt(st.nextToken())
                            + 125.30 * Integer.parseInt(st.nextToken()) + 180.90 * Integer.parseInt(
                            st.nextToken()))).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
