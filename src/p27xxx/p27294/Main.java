package p27xxx.p27294;

// 제목 : 몇개고?

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        System.out.println(Math.abs(Integer.parseInt(st.nextToken()) - 14) > 2
                || Integer.parseInt(st.nextToken()) == 1 ? "280" : "320");
    }
}
