package p15xxx.p15953;

// 제목 : 상금 헌터

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int prize = 0;

            if (a > 21 || a == 0) {
                //
            } else if (a > 15) {
                prize += 100000;
            } else if (a > 10) {
                prize += 300000;
            } else if (a > 6) {
                prize += 500000;
            } else if (a > 3) {
                prize += 2000000;
            } else if (a > 1) {
                prize += 3000000;
            } else {
                prize += 5000000;
            }

            if (b > 31 || b == 0) {
                //
            } else if (b > 15) {
                prize += 320000;
            } else if (b > 7) {
                prize += 640000;
            } else if (b > 3) {
                prize += 1280000;
            } else if (b > 1) {
                prize += 2560000;
            } else {
                prize += 5120000;
            }

            sb.append(prize).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
