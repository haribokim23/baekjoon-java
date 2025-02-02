package p15xxx.p15080;

// 제목 : Every Second Counts

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
        int h1, m1, s1, h2, m2, s2;

        h1 = Integer.parseInt(st1.nextToken());
        st1.nextToken();
        m1 = Integer.parseInt(st1.nextToken());
        st1.nextToken();
        s1 = Integer.parseInt(st1.nextToken());
        h2 = Integer.parseInt(st2.nextToken());
        st2.nextToken();
        m2 = Integer.parseInt(st2.nextToken());
        st2.nextToken();
        s2 = Integer.parseInt(st2.nextToken());

        if (s2 < s1) {
            m2--;
            s2 += 60;
        }

        if (m2 < m1) {
            h2--;
            m2 += 60;
        }

        if (h2 < h1) {
            h2 += 24;
        }

        System.out.println(((h2 - h1) * 60 + m2 - m1) * 60 + s2 - s1);
    }
}
