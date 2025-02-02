package p01xxx.p01475;

// 제목 : 방 번호

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[] counts = new int[9];

        while (n > 0) {
            int number = n % 10;
            counts[number == 9 ? 6 : number]++;
            n /= 10;
        }

        counts[6] = counts[6] / 2 + counts[6] % 2;
        int min = 0;

        for (int count : counts) {
            min = Math.max(min, count);
        }

        System.out.println(min);
    }
}
