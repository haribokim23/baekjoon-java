package p27xxx.p27331;

// 제목 : 2 桁の整数 (Two-digit Integer)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(br.readLine()) * 10 + Integer.parseInt(br.readLine()));
        br.close();
    }
}
