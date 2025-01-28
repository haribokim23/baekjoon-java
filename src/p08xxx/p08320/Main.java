package p08xxx.p08320;

// 제목 : 직사각형을 만드는 방법

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), l = 1, w, count = 0;
        br.close();

        while (l <= n) {
            w = l;

            while (l * w++ <= n) {
                count++;
            }

            l++;
        }

        System.out.println(count);
    }
}
