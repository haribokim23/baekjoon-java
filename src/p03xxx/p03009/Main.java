package p03xxx.p03009;

// 제목 : 네 번째 점

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int x1, x2, x3, y1, y2, y3;

        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        x3 = Integer.parseInt(st.nextToken());
        y3 = Integer.parseInt(st.nextToken());

        if (x1 == x2) {
            x1 = x3;
        } else if (x1 == x3) {
            x1 = x2;
        }

        if (y1 == y2) {
            y1 = y3;
        } else if (y1 == y3) {
            y1 = y2;
        }

        bw.write(x1 + " " + y1 + "\n");
        bw.flush();
        bw.close();

    }
}
