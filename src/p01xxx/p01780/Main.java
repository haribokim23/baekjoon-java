package p01xxx.p01780;

// 제목 : 종이의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] paper;
    private static int[] counts;

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
        counts = new int[3];
        checkPaper(0, 0, n);
        System.out.println(counts[0]);
        System.out.println(counts[1]);
        System.out.println(counts[2]);
    }

    private static void checkPaper(int startRow, int startColumn, int length) {
        boolean isSame = true;
        int value = paper[startRow][startColumn];

        for (int rowOffset = 0; rowOffset < length; rowOffset++) {
            int[] row = paper[startRow + rowOffset];

            for (int columnOffset = 0; columnOffset < length; columnOffset++) {
                if (row[startColumn + columnOffset] != value) {
                    isSame = false;
                    break;
                }
            }

            if (!isSame) {
                break;
            }
        }

        if (isSame) {
            counts[value + 1]++;
            return;
        }

        length /= 3;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                checkPaper(startRow + length * row, startColumn + length * column, length);
            }
        }
    }
}
