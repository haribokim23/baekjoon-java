package p11xxx.p11727;

// 제목 : 2×n 타일링 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        BigInteger[] memo = new BigInteger[1001];
        memo[0] = BigInteger.ZERO;
        memo[1] = BigInteger.ONE;
        memo[2] = BigInteger.valueOf(3);

        for (int i = 3; i < memo.length; i++) {
            // 언어 : Java 11 -> Java 8
            memo[i] = memo[i - 1].add(memo[i - 2].multiply(BigInteger.valueOf(2)));
            // memo[i] = memo[i - 1].add(memo[i - 2].multiply(BigInteger.TWO));
        }

        System.out.println(memo[n].remainder(BigInteger.valueOf(10007)));
    }
}
