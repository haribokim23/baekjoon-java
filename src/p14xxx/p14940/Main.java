package p14xxx.p14940;

// 제목 : 쉬운 최단거리

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] distances = new int[n][m];
        int startRow = -1;
        int startColumn = -1;

        for (int row = 0; row < n; row++) {
            st = new StringTokenizer(br.readLine());

            for (int column = 0; column < m; column++) {
                int value = Integer.parseInt(st.nextToken());
                distances[row][column] = value == 0 ? 0 : -1;

                if (value == 2) {
                    startRow = row;
                    startColumn = column;
                }
            }
        }

        br.close();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(startRow * 1000 + startColumn);
        int distance = 0;

        while (!queue.isEmpty()) {
            Queue<Integer> nextQueue = new LinkedList<Integer>();

            while (!queue.isEmpty()) {
                int row = queue.peek() / 1000;
                int column = queue.poll() % 1000;

                if (distances[row][column] != -1) {
                    continue;
                }

                distances[row][column] = distance;
                int upRow = row - 1;

                if (upRow >= 0 && distances[upRow][column] == -1) {
                    nextQueue.offer(upRow * 1000 + column);
                }

                int downRow = row + 1;

                if (downRow < n && distances[downRow][column] == -1) {
                    nextQueue.offer(downRow * 1000 + column);
                }

                int leftColumn = column - 1;

                if (leftColumn >= 0 && distances[row][leftColumn] == -1) {
                    nextQueue.offer(row * 1000 + leftColumn);
                }

                int rightColumn = column + 1;

                if (rightColumn < m && distances[row][rightColumn] == -1) {
                    nextQueue.offer(row * 1000 + rightColumn);
                }
            }

            queue = nextQueue;
            distance++;
        }

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                sb.append(distances[row][column]).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
