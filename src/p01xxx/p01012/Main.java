package p01xxx.p01012;

// 제목 : 유기농 배추

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            boolean[][] map = new boolean[m][n];
            int k = Integer.parseInt(st.nextToken());

            while (k-- > 0) {
                st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
            }

            int count = 0;

            for (int column = 0; column < m; column++) {
                for (int row = 0; row < n; row++) {
                    if (!map[column][row]) {
                        continue;
                    }

                    count++;
                    Queue<Integer> queue = new LinkedList<Integer>();
                    queue.offer(column * 100 + row);

                    while (!queue.isEmpty()) {
                        int centerColumn = queue.peek() / 100;
                        int centerRow = queue.poll() % 100;

                        if (!map[centerColumn][centerRow]) {
                            continue;
                        }

                        map[centerColumn][centerRow] = false;
                        int upRow = centerRow - 1;

                        if (upRow >= 0 && map[centerColumn][upRow]) {
                            queue.offer(centerColumn * 100 + upRow);
                        }

                        int downRow = centerRow + 1;

                        if (downRow < n && map[centerColumn][downRow]) {
                            queue.offer(centerColumn * 100 + downRow);
                        }

                        int leftColumn = centerColumn - 1;

                        if (leftColumn >= 0 && map[leftColumn][centerRow]) {
                            queue.offer(leftColumn * 100 + centerRow);
                        }

                        int rightColumn = centerColumn + 1;

                        if (rightColumn < m && map[rightColumn][centerRow]) {
                            queue.offer(rightColumn * 100 + centerRow);
                        }
                    }
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}
