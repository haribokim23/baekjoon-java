package p14xxx.p14889;

// 제목 : 스타트와 링크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;
    private static int[][] stat;
    private static int[] start;
    private static int[] link;
    private static int min = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = n / 2;
        stat = new int[n][n];
        start = new int[m];
        link = new int[m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                stat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
        backtrack(1);
        System.out.println(min);

    }

    private static void backtrack(int index) {
        if (index == m) {
            for (int i = 0, j = 0, k = 0; i < n; i++) {
                if (start[j] == i) {
                    if (++j == m) {
                        j--;
                    }
                } else {
                    link[k++] = i;
                }
            }

            int statStart = 0;
            int statLink = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    statStart += stat[start[i]][start[j]];
                    statLink += stat[link[i]][link[j]];
                }
            }

            int diff = Math.abs(statStart - statLink);

            if (diff < min) {
                min = diff;
            }
        } else {
            for (int i = 0; i < n; i++) {
                boolean isValid = true;

                for (int j = 0; j < index; j++) {
                    if (start[j] >= i) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    start[index] = i;
                    backtrack(index + 1);
                }
            }
        }
    }
}
