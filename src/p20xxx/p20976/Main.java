package p20xxx.p20976;

// 제목 : 2 番目に大きい整数 (The Second Largest Integer)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        if (B > C) {
            int temp = B;
            B = C;
            C = temp;
        }

        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        System.out.println(B);
    }
}
