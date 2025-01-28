package p01xxx.p01912;

// 제목 : 연속합

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int max = Integer.parseInt(st.nextToken());

        for (int sum = max, min = Math.min(0, max); n-- > 1; ) {
            sum += Integer.parseInt(st.nextToken());
            max = Math.max(max, sum - min);
            min = Math.min(min, sum);
        }

        System.out.println(max);
    }
}
