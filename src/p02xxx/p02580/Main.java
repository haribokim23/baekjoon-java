package p02xxx.p02580;

// 제목 : 스도쿠

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[][] board = new int[9][9];
    private static int[] empty = new int[81];
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int row = 0; row < 9; row++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int col = 0; col < 9; col++) {
                int num = Integer.parseInt(st.nextToken());
                board[row][col] = num;

                if (num == 0) {
                    empty[count++] = row * 10 + col;
                }
            }
        }

        br.close();
        backtrack(0);
    }

    private static boolean backtrack(int index) {
        if (index == count) {
            StringBuilder sb = new StringBuilder();

            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    sb.append(board[row][col] + " ");
                }

                sb.append("\n");
            }

            System.out.println(sb);
            return true;
        } else {
            int coord = empty[index];
            int row = coord / 10;
            int col = coord % 10;
            boolean[] candidate = new boolean[9];
            Arrays.fill(candidate, true);

            for (int i = 0, startRow = row / 3 * 3, startCol = col / 3 * 3; i < 9; i++) {
                int checkRow = board[row][i];
                int checkCol = board[i][col];
                int checkSqr = board[startRow + i / 3][startCol + i % 3];

                if (checkRow > 0) {
                    candidate[board[row][i] - 1] = false;
                }

                if (checkCol > 0) {
                    candidate[board[i][col] - 1] = false;
                }

                if (checkSqr > 0) {
                    candidate[board[startRow + i / 3][startCol + i % 3] - 1] = false;
                }
            }

            for (int i = 0; i < 9; i++) {
                if (candidate[i]) {
                    board[row][col] = i + 1;

                    if (backtrack(index + 1)) {
                        return true;
                    }
                }
            }

            board[row][col] = 0;
            return false;
        }
    }
}
