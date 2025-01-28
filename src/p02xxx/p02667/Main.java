package p02xxx.p02667;

// 제목 : 단지번호붙이기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();

            for (int j = 0; j < n; j++) {
                visited[i][j] = row.charAt(j) == '0';
            }
        }

        br.close();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    LinkedList<Integer> queue = new LinkedList<>();
                    queue.offer(i * 100 + j);
                    int count = 1;

                    while (!queue.isEmpty()) {
                        int value = queue.poll();
                        int currentX = value / 100;
                        int currentY = value % 100;

                        for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                            int nextX = currentX + d[0];
                            int nextY = currentY + d[1];

                            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n
                                    && !visited[nextX][nextY]) {
                                visited[nextX][nextY] = true;
                                queue.offer(nextX * 100 + nextY);
                                count++;
                            }
                        }
                    }

                    al.add(count);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(al.size()).append("\n");
        al.sort(null);

        for (int count : al) {
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
