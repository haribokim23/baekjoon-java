package p05xxx.p05073;

// 제목 : 삼각형과 세 변

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c
                = Integer.parseInt(st.nextToken()), max;
        StringBuilder sb = new StringBuilder();

        while (a + b + c != 0) {
            max = Math.max(Math.max(a, b), c);

            if (a + b + c - max > max) {
                if (a == b && a == c) {
                    sb.append("Equilateral\n");
                } else if (a == b || a == c || b == c) {
                    sb.append("Isosceles\n");
                } else {
                    sb.append("Scalene\n");
                }
            } else {
                sb.append("Invalid\n");
            }

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }

        br.close();
        System.out.print(sb);
    }
}
