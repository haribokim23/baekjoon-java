package p25xxx.p25592;

// 제목 : 바둑돌 게임

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < 450; i++) {
            n -= i;

            if (i % 2 == 0 && n < 0) {
                System.out.println(0);
                break;
            } else if (n < 0) {
                System.out.println(n * -1);
                break;
            }
        }
    }
}
