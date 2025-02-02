package p25xxx.p25314;

// 제목 : 코딩은 체육과목 입니다

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 언어 : Java 11 -> Java 8
        StringBuilder sb = new StringBuilder();

        for (int count = Integer.parseInt(br.readLine()) / 4; count > 0; count--) {
            sb.append("long ");
        }

        System.out.println(sb.append("int"));
        // System.out.println("long ".repeat(Integer.parseInt(br.readLine()) / 4) + "int");
        br.close();
    }
}
