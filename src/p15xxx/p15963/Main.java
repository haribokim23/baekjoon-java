package p15xxx.p15963;

// 제목 : CASIO

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(st.nextToken().equals(st.nextToken()) ? 1 : 0);

    }
}
