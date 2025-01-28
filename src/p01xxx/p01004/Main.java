package p01xxx.p01004;

// 제목 : 어린 왕자

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                if ((Math.sqrt(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2)) < r) ^ (
                        Math.sqrt(Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2)) < r)) {
                    count++;
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}
