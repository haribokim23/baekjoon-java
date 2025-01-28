package p19xxx.p19944;

// 제목 : 뉴비의 기준은 뭘까?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        System.out.println(M <= 2 ? "NEWBIE!" : M <= N ? "OLDBIE!" : "TLE!");
    }
}
