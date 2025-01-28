package p13xxx.p13277;

// 제목 : 큰 수 곱셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(new BigInteger(st.nextToken()).multiply(new BigInteger(st.nextToken())));

    }
}
