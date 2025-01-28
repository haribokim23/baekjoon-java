package p15xxx.p15025;

// 제목 : Judging Moose

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());

        System.out.println(l == 0 && r == 0 ? "Not a moose"
                : l == r ? "Even " + (l + r) : "Odd " + Math.max(l, r) * 2);
    }
}
