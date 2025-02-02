package p01xxx.p01100;

// 제목 : 하얀 칸

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int count = 0;

        for (int i = 0; i < 8; i++) {
            s = br.readLine();

            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && s.charAt(j) == 'F') {
                    count++;
                }
            }
        }

        br.close();
        System.out.println(count);
    }
}
