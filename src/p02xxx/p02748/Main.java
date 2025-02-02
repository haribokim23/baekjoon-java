package p02xxx.p02748;

// 제목 : 피보나치 수 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();

        long a = 0, b = 1;

        if (n == 0) {
            System.out.println(a);
        } else {
            while (n-- > 1) {
                long temp = b;
                b += a;
                a = temp;
            }

            System.out.println(b);
        }
    }
}
