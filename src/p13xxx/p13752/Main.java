package p13xxx.p13752;

// 제목 : 히스토그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int k = Integer.parseInt(br.readLine());

            while (k-- > 0) {
                sb.append("=");
            }

            sb.append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
