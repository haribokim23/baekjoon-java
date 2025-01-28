package p13xxx.p13909;

// 제목 : 창문 닫기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int open = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            open++;
        }

        System.out.println(open);
    }
}
