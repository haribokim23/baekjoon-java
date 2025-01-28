package p08xxx.p08716;

// 제목 : Pole

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken()), x2
                = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken()), x3, y3,
                x4, y4;
        st = new StringTokenizer(br.readLine());
        br.close();
        x3 = Integer.parseInt(st.nextToken());
        y3 = Integer.parseInt(st.nextToken());
        x4 = Integer.parseInt(st.nextToken());
        y4 = Integer.parseInt(st.nextToken());

        System.out.println((long) Math.max(Math.min(x2, x4) - Math.max(x1, x3), 0) * Math.max(
                Math.min(y1, y3) - Math.max(y2, y4), 0));
    }
}
