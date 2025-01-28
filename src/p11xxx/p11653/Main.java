package p11xxx.p11653;

// 제목 : 소인수분해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        int p = 2;

        while (n > 1) {
            if (n % p == 0) {
                n /= p;
                sb.append(p).append("\n");
            } else {
                p++;
            }
        }

        System.out.print(sb);
    }
}
