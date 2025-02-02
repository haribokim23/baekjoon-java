package p11xxx.p11005;

// 제목 : 진법 변환 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                Integer.toString(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))
                        .toUpperCase());
    }
}
