package p02xxx.p02420;

// 제목 : 사파리월드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(
                new BigInteger(st.nextToken()).subtract(new BigInteger(st.nextToken())).abs());
        br.close();

    }
}
