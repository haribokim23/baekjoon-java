package p16xxx.p16785;

// 제목 : ソーシャルゲーム (Social Game)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), C
                = Integer.parseInt(st.nextToken()), D = 0, M = 0;

        while (M < C) {
            D++;
            M += A;

            if (D % 7 == 0) {
                M += B;
            }
        }

        System.out.println(D);
    }
}
