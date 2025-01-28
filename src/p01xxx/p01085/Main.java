package p01xxx.p01085;

// 제목 : 직사각형에서 탈출

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int x, y, w, h;

        st = new StringTokenizer(br.readLine());
        br.close();
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        bw.write(Math.min(Math.min(x, y), Math.min(w - x, h - y)) + "\n");
        bw.flush();
        bw.close();

    }
}
