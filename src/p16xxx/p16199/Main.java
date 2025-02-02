package p16xxx.p16199;

// 제목 : 나이 계산하기

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
        int y1 = Integer.parseInt(st1.nextToken()), m1 = Integer.parseInt(st1.nextToken()), d1
                = Integer.parseInt(st1.nextToken()), y2 = Integer.parseInt(st2.nextToken()), m2
                = Integer.parseInt(st2.nextToken()), d2 = Integer.parseInt(st2.nextToken());

        System.out.println(
                (m1 > m2 ? y2 - y1 - 1 : m1 == m2 && d1 > d2 ? y2 - y1 - 1 : y2 - y1) + "\n" + (
                        y2 - y1 + 1) + "\n" + (y2 - y1));
    }
}
