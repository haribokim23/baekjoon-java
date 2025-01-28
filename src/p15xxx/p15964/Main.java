package p15xxx.p15964;

// 제목 : 이상한 기호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long A, B;

        st = new StringTokenizer(br.readLine());
        br.close();
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        System.out.println((A + B) * (A - B));

    }
}
