package p18xxx.p18330;

// 제목 : Petrol

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), k = 60 + Integer.parseInt(br.readLine()), price
                = 0;
        br.close();

        while (n > 0) {
            if (k > 0) {
                k--;
                price += 1500;
            } else {
                price += 3000;
            }

            n--;
        }

        System.out.println(price);
    }
}
