package p10xxx.p10953;

// 제목 : A+B - 6

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), ",");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
                    .append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
