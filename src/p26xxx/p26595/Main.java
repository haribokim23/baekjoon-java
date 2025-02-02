package p26xxx.p26595;

// 제목 : 전투의 신

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int a = Integer.parseInt(st.nextToken());
        int pa = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int pb = Integer.parseInt(st.nextToken());
        long x = 0;
        long y = 0;

        for (long i = 0, max = 0; i <= n / pa; i++) {
            long j = (n - i * pa) / pb;
            long sum = a * i + b * j;

            if (sum > max) {
                max = sum;
                x = i;
                y = j;
            }
        }

        System.out.println(x + " " + y);
    }
}
