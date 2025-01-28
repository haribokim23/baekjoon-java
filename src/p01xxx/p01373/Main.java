package p01xxx.p01373;

// 제목 : 2진수 8진수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new BigInteger(br.readLine(), 2).toString(8));
        br.close();
    }
}
