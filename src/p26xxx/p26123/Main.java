package p26xxx.p26123;

// 제목 : 외계 침략자 윤이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        int[] counts = new int[300_000];

        while (n-- > 0) {
            int h = Integer.parseInt(st.nextToken());

            if (h > 0) {
                counts[h - 1]++;
            }
        }

        long sum = 0;

        for (int i = 299_999; d-- > 0 && i >= 0; i--) {
            while (counts[i] == 0) {
                i--;
            }

            int count = counts[i];
            sum += count;

            if (i > 0) {
                counts[i - 1] += count;
            }
        }

        System.out.println(sum);
    }
}
