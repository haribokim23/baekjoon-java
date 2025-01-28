package p27xxx.p27324;

// 제목 : ゾロ目 (Same Numbers)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(n / 10 == n % 10 ? "1" : "0");
    }
}
