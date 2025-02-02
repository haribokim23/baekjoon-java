package p15xxx.p15740;

// 제목 : A+B - 9

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BigInteger A, B;

        st = new StringTokenizer(br.readLine());
        br.close();
        A = new BigInteger(st.nextToken());
        B = new BigInteger(st.nextToken());

        System.out.println(A.add(B));

    }
}
