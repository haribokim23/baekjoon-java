package p16xxx.p16431;

// 제목 : 베시와 데이지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(
                br.readLine()), st3 = new StringTokenizer(br.readLine());
        br.close();
        int bx = Integer.parseInt(st1.nextToken()), by = Integer.parseInt(st1.nextToken()), dx
                = Integer.parseInt(st2.nextToken()), dy = Integer.parseInt(st2.nextToken()), jx
                = Integer.parseInt(st3.nextToken()), jy = Integer.parseInt(st3.nextToken());

        bx = Math.max(Math.abs(jx - bx), Math.abs(jy - by));
        dx = Math.abs(jx - dx) + Math.abs(jy - dy);

        System.out.println(bx < dx ? "bessie" : bx > dx ? "daisy" : "tie");
    }
}
