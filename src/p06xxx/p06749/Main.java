package p06xxx.p06749;

// 제목 : Next in line

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(M + M - Y);
    }
}
