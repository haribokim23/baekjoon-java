package p01xxx.p01212;

// 제목 : 8진수 2진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(new BigInteger(br.readLine(), 8).toString(2));
        br.close();

    }
}
