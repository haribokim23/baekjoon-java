package p09xxx.p09728;

// 제목 : Pair Sum

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            HashSet<Integer> hs = new HashSet<>();
            int count = 0;
            st = new StringTokenizer(br.readLine());

            while (n-- > 0) {
                int value = Integer.parseInt(st.nextToken());

                if (hs.contains(m - value)) {
                    count++;
                }

                hs.add(value);
            }

            sb.append("Case #").append(i).append(": ").append(count).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
