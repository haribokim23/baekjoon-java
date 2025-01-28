package p11xxx.p11721;

// 제목 : 열 개씩 끊어 출력하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() / 10 + 1; i++) {
            sb.append(s.substring(i * 10, Math.min((i + 1) * 10, s.length()))).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
