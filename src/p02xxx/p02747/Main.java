package p02xxx.p02747;

// 제목 : 피보나치 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), o = 0, p = 1, t;
        br.close();

        if (n == 0) {
            System.out.println(o);
        }

        while (n-- > 1) {
            t = p;
            p += o;
            o = t;
        }

        System.out.println(p);
    }
}
