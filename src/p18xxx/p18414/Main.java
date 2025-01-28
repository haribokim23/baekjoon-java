package p18xxx.p18414;

// 제목 : X に最も近い値 (The Nearest Value)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int X = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), R
                = Integer.parseInt(st.nextToken());

        System.out.println(L <= X && X <= R ? X : Math.abs(X - L) < Math.abs(X - R) ? L : R);
    }
}
