package p01xxx.p01236;

// 제목 : 성 지키기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] castle = new int[n][m];
        int horizontal = 0;

        for (int row = 0; row < n; row++) {
            String s = br.readLine();
            int count = 0;

            for (int column = 0; column < m; column++) {
                if (s.charAt(column) == 'X') {
                    castle[row][column]++;
                    count++;
                }
            }

            if (count == 0) {
                horizontal++;
            }
        }

        br.close();
        int vertical = 0;

        for (int column = 0; column < m; column++) {
            int count = 0;

            for (int row = 0; row < n; row++) {
                count += castle[row][column];
            }

            if (count == 0) {
                vertical++;
            }
        }

        System.out.println(Math.max(horizontal, vertical));
    }
}
