package p02xxx.p02460;

// 제목 : 지능형 기차 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 10, count = 0, max = 0;
        StringTokenizer st;

        while (i-- > 0) {
            st = new StringTokenizer(br.readLine());

            count = count - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            if (count > 10000) {
                count = 10000;
            }

            if (count > max) {
                max = count;
            }
        }

        br.close();
        System.out.println(max);
    }
}
