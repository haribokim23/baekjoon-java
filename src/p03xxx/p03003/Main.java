package p03xxx.p03003;

// 제목 : 킹, 퀸, 룩, 비숍, 나이트, 폰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        System.out.println((1 - Integer.parseInt(st.nextToken())) + " " + (1 - Integer.parseInt(
                st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken())) + " " + (2
                - Integer.parseInt(st.nextToken())) + " " + (2 - Integer.parseInt(st.nextToken()))
                + " " + (8 - Integer.parseInt(st.nextToken())));

    }
}
