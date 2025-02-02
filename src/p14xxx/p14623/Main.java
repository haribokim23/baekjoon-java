package p14xxx.p14623;

// 제목 : 감정이입

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                new BigInteger(br.readLine(), 2).multiply(new BigInteger(br.readLine(), 2))
                        .toString(2));
        br.close();
    }
}
