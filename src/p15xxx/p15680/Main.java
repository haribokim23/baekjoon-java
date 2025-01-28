package p15xxx.p15680;

// 제목 : 연세대학교

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                (br.readLine().equals("1")) ? "Leading the Way to the Future" : "YONSEI");
        br.close();

    }
}
