package p30xxx.p30802;

// 제목 : 웰컴 키트

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] counts = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int index = 0; index < 6; index++) {
            counts[index] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        br.close();
        int count = 0;

        for (int index = 0; index < 6; index++) {
            count += (int) Math.ceil((double) counts[index] / t);
        }

        System.out.println(count);
        System.out.println(n / p + " " + n % p);
    }
}
