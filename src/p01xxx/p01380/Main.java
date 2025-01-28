package p01xxx.p01380;

// 제목 : 귀걸이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; ; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            String[] names = new String[n];

            for (int j = 0; j < n; j++) {
                names[j] = br.readLine();
            }

            boolean[] lost = new boolean[n];

            for (int j = 0; j < 2 * n - 1; j++) {
                int number = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()) - 1;
                lost[number] = !lost[number];
            }

            for (int j = 0; j < n; j++) {
                if (lost[j]) {
                    sb.append(i).append(" ").append(names[j]).append("\n");
                }
            }
        }

        br.close();
        System.out.print(sb);
    }
}
