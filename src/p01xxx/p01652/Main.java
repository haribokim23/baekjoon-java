package p01xxx.p01652;

// 제목 : 누울 자리를 찾아라

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] room = new boolean[n][n];
        int horizontal = 0;
        int vertical = 0;

        for (int row = 0; row < n; row++) {
            String s = br.readLine();
            int count = 0;

            for (int column = 0; column < n; column++) {
                if (s.charAt(column) == '.') {
                    room[row][column] = true;
                    count++;
                } else {
                    if (count >= 2) {
                        horizontal++;
                    }

                    count = 0;
                }
            }

            if (count >= 2) {
                horizontal++;
            }
        }

        br.close();

        for (int column = 0; column < n; column++) {
            int count = 0;

            for (int row = 0; row < n; row++) {
                if (room[row][column]) {
                    count++;
                } else {
                    if (count >= 2) {
                        vertical++;
                    }

                    count = 0;
                }
            }

            if (count >= 2) {
                vertical++;
            }
        }

        System.out.println(horizontal + " " + vertical);
    }
}
