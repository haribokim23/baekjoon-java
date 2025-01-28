package p01xxx.p01075;

// 제목 : 나누기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) / 100 * 100, F = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < 100; i++) {
            if ((N + i) % F == 0) {
                System.out.printf("%02d", i);
                break;
            }
        }
    }
}
