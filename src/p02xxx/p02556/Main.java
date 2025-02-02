package p02xxx.p02556;

// 제목 : 별 찍기 - 14

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        // 언어 : Java 11 -> Java 8
        StringBuilder sb1 = new StringBuilder();

        for (int count = 0; count < n; count++) {
            sb1.append("*");
        }

        sb1.append("\n");
        StringBuilder sb2 = new StringBuilder();

        for (int count = 0; count < n; count++) {
            sb2.append(sb1);
        }

        System.out.print(sb2);
        // System.out.print(("*".repeat(n).concat("\n")).repeat(n));
    }
}
