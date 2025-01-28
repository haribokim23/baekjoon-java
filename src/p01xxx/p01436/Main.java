package p01xxx.p01436;

// 제목 : 영화감독 숌

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int number = 666;

        while (n > 0) {
            if (Integer.toString(number).contains("666")) {
                n--;
            }

            number++;
        }

        System.out.println(--number);
    }
}
