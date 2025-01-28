package p14xxx.p14918;

// 주소: https://www.acmicpc.net/problem/14918
// 제목 : 더하기

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

        System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));

    }
}
