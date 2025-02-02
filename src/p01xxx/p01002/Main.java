package p01xxx.p01002;

// 제목 : 터렛

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T, x1, y1, r1, x2, y2, r2;
        double dist;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (dist == 0) {
                if (r1 == r2) {
                    System.out.println("-1");
                } else {
                    System.out.println("0");
                }
            } else {
                if (r1 + r2 < dist) {
                    System.out.println("0");
                } else if (r1 + r2 == dist) {
                    System.out.println("1");
                } else {
                    if (Math.abs(r1 - r2) > dist) {
                        System.out.println("0");
                    } else if (Math.abs(r1 - r2) == dist) {
                        System.out.println("1");
                    } else {
                        System.out.println("2");
                    }
                }
            }
        }

        br.close();

    }
}
