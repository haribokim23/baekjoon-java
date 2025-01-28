package p15xxx.p15439;

// 제목 : 베라의 패션

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;

        N = Integer.parseInt(br.readLine());

        System.out.println(N * N - N);

    }
}
