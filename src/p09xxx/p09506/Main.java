package p09xxx.p09506;

// 제목 : 약수들의 합

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n != -1) {
            int sum = 1;
            StringBuilder sb = new StringBuilder(" = 1");

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(" + ").append(i);
                }
            }

            if (sum == n) {
                System.out.println(n + sb.toString());
            } else {
                System.out.println(n + " is NOT perfect.");
            }

            n = Integer.parseInt(br.readLine());
        }

        br.close();
    }
}
