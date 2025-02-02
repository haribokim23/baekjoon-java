package p01xxx.p01789;

// 제목 : 수들의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        br.close();

        System.out.println((int) ((Math.sqrt(S * 8 + 1) - 1) / 2));
    }
}
