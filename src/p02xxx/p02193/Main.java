package p02xxx.p02193;

// 제목 : 이친수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        long count0 = 0;
        long count1 = 1;

        while (n-- > 1) {
            count0 += count1;
            count1 = count0 - count1;
        }

        System.out.println(count0 + count1);
    }
}
