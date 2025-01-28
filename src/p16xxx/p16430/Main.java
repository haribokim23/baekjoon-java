package p16xxx.p16430;

// 제목 : 제리와 톰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int A, B;

        st = new StringTokenizer(br.readLine());
        br.close();
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        A = B - A;

        if (A % 2 == 0 && B % 2 == 0) {
            A /= 2;
            B /= 2;
        } else if (A % 3 == 0 && B % 3 == 0) {
            A /= 3;
            B /= 3;
        }

        System.out.println(A + " " + B);

    }
}
