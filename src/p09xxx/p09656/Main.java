package p09xxx.p09656;

// 제목 : 돌 게임 2

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(br.readLine()) % 2 == 0 ? "SK" : "CY");
        br.close();
    }
}
