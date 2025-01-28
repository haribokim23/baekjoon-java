package p20xxx.p20673;

// 제목 : Covid-19

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(p <= 50 && q <= 10 ? "White" : q > 30 ? "Red" : "Yellow");
    }
}
