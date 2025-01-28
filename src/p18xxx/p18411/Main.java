package p18xxx.p18411;

// 제목 : 試験 (Exam)

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
                = Integer.parseInt(st.nextToken());

        System.out.println(A + B + C - Math.min(Math.min(A, B), C));
    }
}
