package p21xxx.p21631;

// 제목 : Checkers

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                Math.min(Long.parseLong(st.nextToken()) + 1, Long.parseLong(st.nextToken())));
    }
}
