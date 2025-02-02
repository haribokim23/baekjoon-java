package p01xxx.p01018;

// 제목 : 체스판 다시 칠하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];

        for (int row = 0; row < n; row++) {
            String line = br.readLine();

            for (int col = 0; col < m; col++) {
                board[row][col] = line.charAt(col);
            }
        }

        int min = 64;

        for (int startRow = 0; startRow < n - 7; startRow++) {
            for (int startCol = 0; startCol < m - 7; startCol++) {
                int diff = 0;

                for (int row = 0; row < 8; row++) {
                    for (int col = 0; col < 8; col++) {
                        char color = board[startRow + row][startCol + col];

                        if ((row + col) % 2 == 0) {
                            if (color == 'B') {
                                diff++;
                            }
                        } else {
                            if (color == 'W') {
                                diff++;
                            }
                        }
                    }
                }

                if (diff > 32) {
                    diff = 64 - diff;
                }

                if (diff < min) {
                    min = diff;
                }
            }
        }

        System.out.println(min);
        br.close();
    }
}
