package p05xxx.p05341;

// 제목 : Pyramids

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int base = Integer.parseInt(br.readLine()); base != 0;
                base = Integer.parseInt(br.readLine())) {
            sb.append((base * (base + 1)) / 2).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
