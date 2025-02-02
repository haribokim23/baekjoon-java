package p25xxx.p25628;

// 제목 : 햄버거 만들기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        System.out.println(
                Math.min(Integer.parseInt(st.nextToken()) / 2, Integer.parseInt(st.nextToken())));
    }
}
