package p10xxx.p10810;

// 제목 : 공 넣기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baskets = new int[n];

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int l = i; l <= j; l++) {
                baskets[l - 1] = k;
            }
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i : baskets) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
