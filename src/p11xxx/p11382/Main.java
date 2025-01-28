package p11xxx.p11382;

// 제목 : 꼬마 정민

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

        System.out.println(
                Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + Long.parseLong(
                        st.nextToken()));

    }
}
