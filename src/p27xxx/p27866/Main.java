package p27xxx.p27866;

// 제목 : 문자와 문자열

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(s.charAt(Integer.parseInt(br.readLine()) - 1));
        br.close();
    }
}
