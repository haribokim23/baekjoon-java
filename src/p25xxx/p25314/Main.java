package p25xxx.p25314;

// 제목 : 코딩은 체육과목 입니다

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("long ".repeat(Integer.parseInt(br.readLine()) / 4) + "int");
        br.close();
    }
}
