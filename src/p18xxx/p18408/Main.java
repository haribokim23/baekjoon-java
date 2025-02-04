package p18xxx.p18408;

// 제목 : 3 つの整数 (Three Integers)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                + Integer.parseInt(st.nextToken()) < 5 ? 1 : 2);
    }
}
