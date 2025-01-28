package p05xxx.p05596;

// 제목 : 시험 점수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(Math.max(
                Integer.parseInt(st1.nextToken()) + Integer.parseInt(st1.nextToken())
                        + Integer.parseInt(st1.nextToken()) + Integer.parseInt(st1.nextToken()),
                Integer.parseInt(st2.nextToken()) + Integer.parseInt(st2.nextToken())
                        + Integer.parseInt(st2.nextToken()) + Integer.parseInt(st2.nextToken())));

    }
}
