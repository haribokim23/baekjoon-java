package p17xxx.p17874;

// 제목 : Piece of Cake!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), v
                = Integer.parseInt(st.nextToken());

        System.out.println((n - h > h ? n - h : h) * (n - v > v ? n - v : v) * 4);
    }
}
