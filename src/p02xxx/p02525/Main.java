package p02xxx.p02525;

// 제목 : 오븐 시계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h, m;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
        br.close();

        while (m >= 60) {
            m -= 60;
            h++;
        }

        System.out.println((h % 24) + " " + m);

    }
}
