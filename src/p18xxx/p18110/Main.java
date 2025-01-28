package p18xxx.p18110;

// 제목 : solved.ac

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] levels = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int level = Integer.parseInt(br.readLine());
            levels[i] = level;
            sum += level;
        }

        br.close();
        Arrays.sort(levels);
        int trim = (int) Math.round(n * 0.15);

        for (int i = 0; i < trim; i++) {
            sum -= levels[i];
        }

        for (int i = n - trim; i < n; i++) {
            sum -= levels[i];
        }

        System.out.println((int) Math.round((double) sum / (n - 2 * trim)));
    }
}
