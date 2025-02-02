package p15xxx.p15048;

// 제목 : Jogo de Boca

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(new BigInteger(br.readLine()).mod(BigInteger.valueOf(3)));
        br.close();
    }
}
