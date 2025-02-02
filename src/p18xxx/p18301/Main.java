package p18xxx.p18301;

// 제목 : Rats

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        System.out.println((int) Math.floor(
                (Integer.parseInt(st.nextToken()) + 1) * (Integer.parseInt(st.nextToken()) + 1) / (
                        Integer.parseInt(st.nextToken()) + 1) - 1));

    }
}
