package p02xxx.p02997;

// 제목 : 네 번째 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] a = new int[3];
        int d1, d2;

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        d1 = a[1] - a[0];
        d2 = a[2] - a[1];

        System.out.println(d1 == d2 ? a[2] + d1 <= 100 ? a[2] + d1 : a[0] - d1
                : d1 > d2 ? a[0] + d2 : a[1] + d1);
    }
}
