package p02xxx.p02903;

// 제목 : 중앙 이동 알고리즘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((int) Math.pow(Math.pow(2, N) + 1, 2));
    }
}
