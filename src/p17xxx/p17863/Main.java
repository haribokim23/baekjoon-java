package p17xxx.p17863;

// 제목 : FYI

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) / 10000 == 555 ? "YES" : "NO");
        br.close();
    }
}
