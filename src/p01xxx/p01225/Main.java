package p01xxx.p01225;

// 제목 : 이상한 곱셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        String A = st.nextToken(), B = st.nextToken();
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                sum = sum.add(BigInteger.valueOf((A.charAt(i) - '0') * (B.charAt(j) - '0')));
            }
        }

        System.out.println(sum);
    }
}
