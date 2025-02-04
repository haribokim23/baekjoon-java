package p03xxx.p03273;

// 제목 : 두 수의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        int x = Integer.parseInt(br.readLine());
        br.close();
        int count = 0;

        for (int i = 0, j = n - 1; i != j; ) {
            int ai = a[i];
            int sum = ai + a[j];

            if (sum < x) {
                i++;
            } else if (sum > x) {
                j--;
            } else {
                count++;

                if (a[i + 1] == ai) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(count);
    }
}
