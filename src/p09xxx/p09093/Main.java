package p09xxx.p09093;

// 제목 : 단어 뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                sb.append(new StringBuilder(st.nextToken()).reverse()).append(" ");
            }

            sb.append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
