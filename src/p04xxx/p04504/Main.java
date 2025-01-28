package p04xxx.p04504;

// 제목 : 배수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (m != 0) {
            sb.append(m).append(" is ").append(m % n == 0 ? "" : "NOT ").append("a multiple of ")
                    .append(n).append(".\n");

            m = Integer.parseInt(br.readLine());
        }

        br.close();
        System.out.print(sb);
    }
}
