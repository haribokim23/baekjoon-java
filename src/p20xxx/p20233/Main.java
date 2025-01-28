package p20xxx.p20233;

// 제목 : Bicycle

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(
                (a + Math.max(0, T - 30) * x * 21) + " " + (b + Math.max(0, T - 45) * y * 21));
    }
}
