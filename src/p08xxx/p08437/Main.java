package p08xxx.p08437;

// 제목 : Julka

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger small, diff;

        small = new BigInteger(br.readLine());
        diff = new BigInteger(br.readLine());
        small = small.subtract(diff).divide(new BigInteger("2"));
        br.close();

        System.out.println(small.add(diff) + "\n" + small);

    }
}
