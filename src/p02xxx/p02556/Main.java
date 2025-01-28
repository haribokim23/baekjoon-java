package p02xxx.p02556;

// 제목 : 별 찍기 - 14

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        System.out.print(("*".repeat(n).concat("\n")).repeat(n));
    }
}
