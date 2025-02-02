package p05xxx.p05597;

// 제목 : 과제 안 내신 분..?

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] present = new boolean[30];

        for (int i = 0; i < 28; i++) {
            present[Integer.parseInt(br.readLine()) - 1] = true;
        }

        br.close();

        for (int i = 0; i < 30; i++) {
            if (!present[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
