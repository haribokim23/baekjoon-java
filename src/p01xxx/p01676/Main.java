package p01xxx.p01676;

// 제목 : 팩토리얼 0의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(N / 5 + N / 25 + N / 125);
    }
}
