package p05xxx.p05565;

// 제목 : 영수증

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine()), i = 9;

        while (i-- > 0) {
            p -= Integer.parseInt(br.readLine());
        }

        br.close();
        System.out.println(p);
    }
}
