package p11xxx.p11943;

// 제목 : 파일 옮기기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        B += Integer.parseInt(st.nextToken());
        A += Integer.parseInt(st.nextToken());

        System.out.println(Math.min(A, B));

    }
}
