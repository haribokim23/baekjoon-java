package p11xxx.p11966;

// 제목 : 2의 제곱인가?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((n & (n - 1)) == 0 ? 1 : 0);
    }
}
