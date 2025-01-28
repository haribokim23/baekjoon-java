package p13xxx.p13322;

// 제목 : 접두사 배열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}
