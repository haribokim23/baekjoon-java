package p01xxx.p01149;

// 제목 : RGB거리

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rMin = Integer.parseInt(st.nextToken());
        int gMin = Integer.parseInt(st.nextToken());
        int bMin = Integer.parseInt(st.nextToken());

        while (n-- > 1) {
            st = new StringTokenizer(br.readLine());
            int r = Math.min(gMin, bMin) + Integer.parseInt(st.nextToken());
            int g = Math.min(rMin, bMin) + Integer.parseInt(st.nextToken());
            int b = Math.min(rMin, gMin) + Integer.parseInt(st.nextToken());
            rMin = r;
            gMin = g;
            bMin = b;
        }

        br.close();
        System.out.println(Math.min(Math.min(rMin, gMin), bMin));
    }
}
