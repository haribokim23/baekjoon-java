package p02xxx.p02475;

// 제목 : 검증수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println((int) (Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(
                Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2)
                + Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(
                Integer.parseInt(st.nextToken()), 2)) % 10);

    }
}
