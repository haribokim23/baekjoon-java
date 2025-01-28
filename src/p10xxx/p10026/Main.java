package p10xxx.p10026;

// 제목 : 적록색약

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][][] colors = new int[2][n][n];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();

            for (int j = 0; j < n; j++) {
                switch (row.charAt(j)) {
                    case 'R':
                        colors[0][i][j] = 0;
                        colors[1][i][j] = 0;
                        break;
                    case 'G':
                        colors[0][i][j] = 1;
                        colors[1][i][j] = 0;
                        break;
                    case 'B':
                        colors[0][i][j] = 2;
                        colors[1][i][j] = 2;
                }
            }
        }

        br.close();
        int[] counts = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2; k++) {
                    if (colors[k][i][j] != -1) {
                        counts[k]++;
                        LinkedList<Integer> queue = new LinkedList<>();
                        queue.offer(i * 1000 + j);
                        int color = colors[k][i][j];
                        colors[k][i][j] = -1;

                        while (!queue.isEmpty()) {
                            int value = queue.poll();
                            int currentX = value / 1000;
                            int currentY = value % 1000;

                            for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                                int nextX = currentX + d[0];
                                int nextY = currentY + d[1];

                                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n
                                        && colors[k][nextX][nextY] == color) {
                                    colors[k][nextX][nextY] = -1;
                                    queue.offer(nextX * 1000 + nextY);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(counts[0] + " " + counts[1]);
    }
}
