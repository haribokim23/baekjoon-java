package p02xxx.p02902;

// 제목 : KMP는 왜 KMP일까?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(br.readLine().replaceAll("[^A-Z]", ""));
        br.close();
    }
}
