package p01xxx.p01049;

// 제목 : 기타줄

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int price6 = 1000;
        int price1 = 1000;

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            price6 = Math.min(price6, Integer.parseInt(st.nextToken()));
            price1 = Math.min(price1, Integer.parseInt(st.nextToken()));
        }

        br.close();
        System.out.println(Math.min(price6 * (int) Math.ceil(n / 6.0),
                Math.min(price6 * (n / 6) + price1 * (n % 6), price1 * n)));
    }
}
