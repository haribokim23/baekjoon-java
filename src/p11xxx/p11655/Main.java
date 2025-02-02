package p11xxx.p11655;

// 제목 : ROT13

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);

            if ('A' <= c && c <= 'Z') {
                c = c + 13;

                if (c > 'Z') {
                    c -= 26;
                }
            }

            if ('a' <= c && c <= 'z') {
                c = c + 13;

                if (c > 'z') {
                    c -= 26;
                }
            }

            sb.append((char) c);
        }

        System.out.println(sb);
    }
}
