package p02xxx.p02965;

// 제목 : 캥거루 세마리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), C
                = Integer.parseInt(st.nextToken());

        System.out.println(Math.max(B - A, C - B) - 1);
    }
}
