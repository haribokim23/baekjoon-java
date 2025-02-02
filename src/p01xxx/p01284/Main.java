package p01xxx.p01284;

// 제목 : 집 주소

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        StringBuilder sb = new StringBuilder();

        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int l = (int) (Math.log10(n) + 1);
            int w = 1 + l;

            while (l-- > 0) {
                switch (n % 10) {
                    case 0:
                        w += 4;
                        break;
                    case 1:
                        w += 2;
                        break;
                    default:
                        w += 3;
                        break;
                }

                n /= 10;
            }

            sb.append(w).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
