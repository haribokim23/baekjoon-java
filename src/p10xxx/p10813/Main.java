package p10xxx.p10813;

// 제목 : 공 바꾸기

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

        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i : baskets) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
