package p13xxx.p13597;

// 제목 : Tri-du

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
}
