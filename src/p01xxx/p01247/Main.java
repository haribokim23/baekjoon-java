package p01xxx.p01247;

// 제목 : 부호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 3;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            BigInteger s = BigInteger.ZERO;

            while (n-- > 0) {
                s = s.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            }

            switch (s.compareTo(BigInteger.ZERO)) {
                case -1:
                    sb.append("-\n");
                    break;
                case 0:
                    sb.append("0\n");
                    break;
                case 1:
                    sb.append("+\n");
                    break;
                default:
                    System.exit(-1);
            }
        }

        br.close();
        System.out.print(sb);
    }
}
