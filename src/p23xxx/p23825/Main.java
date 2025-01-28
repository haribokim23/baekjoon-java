package p23xxx.p23825;

// 제목 : SASA 모형을 만들어보자

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                Math.min(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())) / 2);
    }
}
