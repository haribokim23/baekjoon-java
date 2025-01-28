package p09xxx.p09316;

// 제목 : Hello Judge

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append("Hello World, Judge ").append(i).append("!\n");
        }

        System.out.print(sb);
    }
}
