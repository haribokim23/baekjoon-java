package p24xxx.p24087;

// 제목 : アイスクリーム (Ice Cream)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(250 + (S < A ? 0 : (int) Math.ceil((double) (S - A) / B) * 100));
    }
}
