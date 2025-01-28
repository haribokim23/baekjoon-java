package p24xxx.p24313;

// 제목 : 알고리즘 수업 - 점근적 표기 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(a1 * n0 + a0 <= c * n0 && a1 <= c ? 1 : 0);
    }
}
