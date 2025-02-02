package p02xxx.p02744;

// 제목 : 대소문자 바꾸기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c;
        StringBuilder sb = new StringBuilder();

        while ((c = br.read()) > 64) {
            if (c < 96) {
                c += 32;
            } else {
                c -= 32;
            }

            sb.append((char) c);
        }

        br.close();
        System.out.println(sb);
    }
}
