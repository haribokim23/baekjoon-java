package p01xxx.p01010;

// 제목 : 다리 놓기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] factorial = new BigInteger[30];
        factorial[0] = BigInteger.ONE;

        for (int index = 1; index < 30; index++) {
            factorial[index] = factorial[index - 1].multiply(
                    new BigInteger(Integer.toString(index)));
        }

        StringBuilder sb = new StringBuilder();

        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(factorial[m].divide(factorial[m - n]).divide(factorial[n])).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
