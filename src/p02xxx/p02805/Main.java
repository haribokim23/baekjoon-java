package p02xxx.p02805;

// 제목 : 나무 자르기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        int[] tree = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(st.nextToken());
            tree[i] = height;

            if (height > max) {
                max = height;
            }
        }

        long sum = 0;
        int min = 0;
        int height = 0;

        while (min <= max) {
            sum = 0;
            int mid = (min + max) / 2;

            for (int i = 0; i < n; i++) {
                int length = tree[i];

                if (length > mid) {
                    sum += length - mid;
                }
            }

            if (sum < m) {
                max = mid - 1;
            } else {
                height = mid;
                min = mid + 1;
            }
        }

        System.out.println(height);
    }
}
