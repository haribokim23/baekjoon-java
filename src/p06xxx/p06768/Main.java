package p06xxx.p06768;

// 제목 : Don’t pass me the ball!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(br.readLine()), count = 0;
        br.close();

        for (int i = 1; i < j - 2; i++) {
            for (int k = i + 1; k < j - 1; k++) {
                count += j - 1 - k;
            }
        }

        System.out.println(count);
    }
}
