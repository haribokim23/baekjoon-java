package p22xxx.p22193;

// 제목 : Multiply

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        System.out.println(new BigInteger(br.readLine()).multiply(new BigInteger(br.readLine())));
        br.close();
    }
}
