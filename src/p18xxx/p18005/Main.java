package p18xxx.p18005;

// 제목 : Even or Odd?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(n % 2 == 1 ? 0 : n / 2 % 2 == 1 ? 1 : 2);
    }
}
