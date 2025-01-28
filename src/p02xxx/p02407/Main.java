package p02xxx.p02407;

// 제목 : 조합

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger[] memo = new BigInteger[n + 1];
        memo[0] = BigInteger.ONE;
        memo[1] = BigInteger.ONE;

        for (int i = 2; i < n + 1; i++) {
            memo[i] = memo[i - 1].multiply(BigInteger.valueOf(i));
        }

        System.out.println(memo[n].divide(memo[m].multiply(memo[n - m])));
    }
}
