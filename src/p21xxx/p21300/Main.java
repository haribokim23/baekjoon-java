package p21xxx.p21300;

// 제목 : Bottle Return

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) * 5);
    }
}
