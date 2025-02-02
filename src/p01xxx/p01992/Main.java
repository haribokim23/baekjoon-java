package p01xxx.p01992;

// 제목 : 쿼드트리

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int[][] image;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        image = new int[n][n];

        for (int row = 0; row < n; row++) {
            String line = br.readLine();

            for (int column = 0; column < n; column++) {
                image[row][column] = line.charAt(column) - '0';
            }
        }

        br.close();
        sb = new StringBuilder();
        quadTree(0, 0, n);
        System.out.println(sb);
    }

    private static void quadTree(int startRow, int startColumn, int length) {
        boolean isSame = true;
        int value = image[startRow][startColumn];

        for (int rowOffset = 0; rowOffset < length; rowOffset++) {
            int[] row = image[startRow + rowOffset];

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
            sb.append(value);
        } else {
            length /= 2;
            sb.append("(");

            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    quadTree(startRow + length * row, startColumn + length * column, length);
                }
            }

            sb.append(")");
        }
    }
}
