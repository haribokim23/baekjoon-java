package p15xxx.p15894;

// 제목 : 수학은 체육과목 입니다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(new BigInteger(br.readLine()).multiply(new BigInteger("4")));

    }
}
