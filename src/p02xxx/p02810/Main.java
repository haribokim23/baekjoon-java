package p02xxx.p02810;

// 제목 : 컵홀더

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String seats = br.readLine();
        br.close();

        int max = seats.length();
        seats = seats.replaceAll("LL", "L");
        System.out.println(Math.min(max, seats.length() + 1));
    }
}
