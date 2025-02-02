package p01xxx.p01654;

// 제목 : 랜선 자르기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] cable = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            int length = Integer.parseInt(br.readLine());
            cable[i] = length;
            max += length;
        }

        br.close();
        max /= n;
        long min = 1;
        long length = 0;

        while (min <= max) {
            long count = 0;
            long mid = (min + max) / 2;

            for (int i = 0; i < k; i++) {
                count += cable[i] / mid;
            }

            if (count < n) {
                max = mid - 1;
            } else {
                length = mid;
                min = mid + 1;
            }
        }

        System.out.println(length);
    }
}
