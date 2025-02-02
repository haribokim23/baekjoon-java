package p11xxx.p11051;

// 제목 : 이항 계수 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    private static BigInteger[] memo;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        memo = new BigInteger[n + 1];
        memo[0] = BigInteger.ONE;
        memo[1] = BigInteger.ONE;

        for (int i = 2; i < memo.length; i++) {
            memo[i] = memo[i - 1].multiply(BigInteger.valueOf(i));
        }

        System.out.println(
                memo[n].divide(memo[k].multiply(memo[n - k])).remainder(BigInteger.valueOf(10007)));
    }
}
