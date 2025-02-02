package p20xxx.p20254;

// 제목 : Site Score

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                56 * Integer.parseInt(st.nextToken()) + 24 * Integer.parseInt(st.nextToken())
                        + 14 * Integer.parseInt(st.nextToken()) + 6 * Integer.parseInt(
                        st.nextToken()));
    }
}
