package p02xxx.p02630;

// 제목 : 색종이 만들기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] paper;
    private static int white;
    private static int blue;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for (int row = 0; row < n; row++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int column = 0; column < n; column++) {
                paper[row][column] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
        white = 0;
        blue = 0;
        recurse(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void recurse(int x, int y, int length) {
        int first = paper[x][y];
        boolean same = true;

        for (int row = x; row < x + length; row++) {
            for (int column = y; column < y + length; column++) {
                if (paper[row][column] != first) {
                    same = false;
                    break;
                }
            }
        }

        if (same) {
            if (first == 0) {
                white++;
            } else {
                blue++;
            }

            return;
        }

        length /= 2;
        recurse(x, y, length);
        recurse(x + length, y, length);
        recurse(x, y + length, length);
        recurse(x + length, y + length, length);
    }
}
