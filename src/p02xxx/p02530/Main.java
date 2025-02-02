package p02xxx.p02530;

// 제목 : 인공지능 시계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
        br.close();

        while (s >= 60) {
            s -= 60;
            m++;
        }

        while (m >= 60) {
            m -= 60;
            h++;
        }

        System.out.println((h % 24) + " " + m + " " + s);

    }
}
