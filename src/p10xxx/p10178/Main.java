package p10xxx.p10178;

// 제목 : 할로윈의 사탕

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

            sb.append("You get ").append(a / b).append(" piece(s) and your dad gets ").append(a % b)
                    .append(" piece(s).\n");
        }

        br.close();
        System.out.print(sb);
    }
}
