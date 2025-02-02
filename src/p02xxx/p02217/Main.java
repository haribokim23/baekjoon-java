package p02xxx.p02217;

// 제목 : 로프

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(ropes);
        int max = ropes[n - 1];

        for (int i = 0; i < n; i++) {
            max = Math.max(max, ropes[i] * (n - i));
        }

        System.out.println(max);
    }
}
