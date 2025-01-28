package p18xxx.p18406;

// 제목 : 럭키 스트레이트

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        br.close();
        int length = n.length();
        int left = 0;

        for (int i = 0; i < length / 2; i++) {
            left += n.charAt(i) - '0';
        }

        int right = 0;

        for (int i = length / 2; i < length; i++) {
            right += n.charAt(i) - '0';
        }

        System.out.println(left == right ? "LUCKY" : "READY");
    }
}
