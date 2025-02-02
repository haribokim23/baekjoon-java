package p08xxx.p08246;

// 제목 : Stół

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        long A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), K
                = Integer.parseInt(st.nextToken());

        A -= A % K;
        B -= B % K;

        System.out.println(
                A / K * B / K - Math.max((A - 2 * K), 0) / K * Math.max((B - 2 * K), 0) / K);
    }
}
