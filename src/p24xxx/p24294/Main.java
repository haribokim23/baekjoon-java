package p24xxx.p24294;

// 제목 : ГРАДИНА

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w1 = Integer.parseInt(br.readLine());
        int h1 = Integer.parseInt(br.readLine());
        int w2 = Integer.parseInt(br.readLine());
        int h2 = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((Math.max(w1, w2) + h1 + h2) * 2 + 4);
    }
}
