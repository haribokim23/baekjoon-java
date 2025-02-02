package p06xxx.p06764;

// 제목 : Sounds fishy!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c
                = Integer.parseInt(br.readLine()), d = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(a < b && b < c && c < d ? "Fish Rising"
                : a > b && b > c && c > d ? "Fish Diving"
                        : a == b && a == c && a == d ? "Fish At Constant Depth" : "No Fish");
    }
}
