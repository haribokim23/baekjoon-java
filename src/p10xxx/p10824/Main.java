package p10xxx.p10824;

// 제목 : 네 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Long.parseLong(st.nextToken() + st.nextToken()) + Long.parseLong(
                st.nextToken() + st.nextToken()));
        br.close();
    }
}
