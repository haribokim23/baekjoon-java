package p17xxx.p17362;

// 제목 : 수학은 체육과목 입니다 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) - 1;
        br.close();

        System.out.println(((n / 4 % 2 == 0) ? n % 4 : 4 - (n % 4)) + 1);
    }
}
