package p04xxx.p04880;

// 제목 : 다음수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a1 = Double.parseDouble(st.nextToken()), a2 = Double.parseDouble(st.nextToken()), a3
                = Double.parseDouble(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (!(a1 == 0 && a2 == 0 && a3 == 0)) {
            if (a2 / a1 == a3 / a2) {
                sb.append("GP ").append((int) (a3 * a3 / a2));
            } else {
                sb.append("AP ").append((int) (a3 + a3 - a2));
            }

            sb.append("\n");

            st = new StringTokenizer(br.readLine());
            a1 = Integer.parseInt(st.nextToken());
            a2 = Integer.parseInt(st.nextToken());
            a3 = Integer.parseInt(st.nextToken());
        }

        br.close();
        System.out.print(sb);
    }
}
