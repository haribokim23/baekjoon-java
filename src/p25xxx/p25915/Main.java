package p25xxx.p25915;

// 제목 : 연세여 사랑한다

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Math.abs(br.readLine().charAt(0) - 'I') + 84);
        br.close();
    }
}
