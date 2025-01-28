package p15xxx.p15474;

// 제목 : 鉛筆 (Pencils)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        double N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), C
                = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());

        System.out.println((int) Math.min(Math.ceil(N / A) * B, Math.ceil(N / C) * D));
    }
}
