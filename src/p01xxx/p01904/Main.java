package p01xxx.p01904;

// 제목 : 01타일

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int b = 1;

        for (int temp, a = 1; n-- > 1; a = temp) {
            temp = b;
            b = (a + b) % 15746;
        }

        System.out.println(b);
    }
}
