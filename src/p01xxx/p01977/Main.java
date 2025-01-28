package p01xxx.p01977;

// 제목 : 완전제곱수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();
        int mSqrt = (int) Math.ceil(Math.sqrt(m));
        int nSqrt = (int) Math.floor(Math.sqrt(n)) + 1;

        if (nSqrt - mSqrt <= 1) {
            System.out.println(-1);
            return;
        }

        int sum = 0;

        for (int i = mSqrt; i < nSqrt; i++) {
            sum += i * i;
        }

        System.out.println(sum + "\n" + mSqrt * mSqrt);
    }
}
