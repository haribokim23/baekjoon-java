package p02xxx.p02010;

// 제목 : 플러그

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), sum = 1;

        while (n-- > 0) {
            sum += Integer.parseInt(br.readLine()) - 1;
        }

        br.close();
        System.out.println(sum);
    }
}
