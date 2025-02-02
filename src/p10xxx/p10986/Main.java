package p10xxx.p10986;

// 제목 : 나머지 합

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        long[] remainders = new long[m];
        remainders[0]++;
        long count = 0;

        for (int index = 0, sum = 0; index < n; index++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % m;
            count += remainders[sum]++;
        }

        System.out.println(count);
    }
}
