package p24xxx.p24264;

// 제목 : 알고리즘 수업 - 알고리즘의 수행 시간 3

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        System.out.println(n * n + "\n2");
    }
}
