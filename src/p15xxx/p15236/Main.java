package p15xxx.p15236;

// 제목 : Dominos

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), spots = 0;
        br.close();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                spots += i + j;
            }
        }

        System.out.println(spots);
    }
}
