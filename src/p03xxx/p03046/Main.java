package p03xxx.p03046;

// 제목 : R2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                -1 * Integer.parseInt(st.nextToken()) + 2 * Integer.parseInt(st.nextToken()));

    }
}
