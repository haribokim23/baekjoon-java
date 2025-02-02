package p15xxx.p15059;

// 제목 : Hard choice

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(
                br.readLine());
        br.close();
        int C = Integer.parseInt(st2.nextToken()) - Integer.parseInt(st1.nextToken()), B =
                Integer.parseInt(st2.nextToken()) - Integer.parseInt(st1.nextToken()), P =
                Integer.parseInt(st2.nextToken()) - Integer.parseInt(st1.nextToken());

        System.out.println(
                (C > 0 ? Math.abs(C) : 0) + (B > 0 ? Math.abs(B) : 0) + (P > 0 ? Math.abs(P) : 0));
    }
}
