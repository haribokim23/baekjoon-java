package p02xxx.p02338;

// 제목 : 긴자리 계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A, B;

        A = new BigInteger(br.readLine());
        B = new BigInteger(br.readLine());

        System.out.println(A.add(B) + "\n" + A.subtract(B) + "\n" + A.multiply(B));

    }
}
