package p01xxx.p01357;

// 제목 : 뒤집힌 덧셈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                rev(rev(Integer.parseInt(st.nextToken())) + rev(Integer.parseInt(st.nextToken()))));
    }

    private static int rev(int i) {
        int o = 0;

        while (i > 0) {
            o = o * 10 + i % 10;
            i /= 10;
        }

        return o;
    }
}
