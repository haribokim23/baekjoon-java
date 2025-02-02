package p27xxx.p27465;

// 제목 : 소수가 아닌 수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(n < 3 ? 4 : (n + n % 2));
    }
}
