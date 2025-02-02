package p15xxx.p15624;

// 제목 : 피보나치 수 7

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int a = 0;
        int b = 1;

        while (n-- > 0) {
            int c = (a + b) % 1_000_000_007;
            a = b;
            b = c;
        }

        System.out.println(a);
    }
}
