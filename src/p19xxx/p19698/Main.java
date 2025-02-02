package p19xxx.p19698;

// 제목 : 헛간 청약

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken()), H
                = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(N, W / L * (H / L)));
    }
}
