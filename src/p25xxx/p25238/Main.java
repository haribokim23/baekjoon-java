package p25xxx.p25238;

// 제목 : 가희와 방어율 무시

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        System.out.println(
                Integer.parseInt(st.nextToken()) * (100 - Integer.parseInt(st.nextToken())) < 10000
                        ? 1 : 0);
    }
}
