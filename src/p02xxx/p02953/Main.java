package p02xxx.p02953;

// 제목 : 나는 요리사다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, sum = 0, max = 0, num = 0;
        StringTokenizer st;

        while (i++ < 5) {
            st = new StringTokenizer(br.readLine());
            sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            if (sum > max) {
                max = sum;
                num = i;
            }
        }

        br.close();
        System.out.println(num + " " + max);
    }
}
