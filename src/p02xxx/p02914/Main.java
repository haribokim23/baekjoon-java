package p02xxx.p02914;

// 제목 : 저작권

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        System.out.println(
                Integer.parseInt(st.nextToken()) * (Integer.parseInt(st.nextToken()) - 1) + 1);

    }
}
