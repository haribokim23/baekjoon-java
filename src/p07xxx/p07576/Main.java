package p07xxx.p07576;

// 제목 : 토마토

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] tomatoes = new int[m][n];
        int green = 0;
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int tomato = Integer.parseInt(st.nextToken());
                tomatoes[i][j] = tomato;

                if (tomato == 0) {
                    green++;
                } else if (tomato == 1) {
                    queue.offer(i * 1000 + j);
                }
            }
        }

        br.close();

        if (green == 0) {
            System.out.println(0);
            return;
        }

        int days = -1;

        while (!queue.isEmpty()) {
            LinkedList<Integer> nextQueue = new LinkedList<>();

            while (!queue.isEmpty()) {
                int current = queue.pop();
                int currentX = current / 1000;
                int currentY = current % 1000;

                for (int d : new int[]{1, -1, -10, 10}) {
                    int nextX = currentX + d / 10;
                    int nextY = currentY + d % 10;

                    if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n
                            && tomatoes[nextX][nextY] == 0) {
                        tomatoes[nextX][nextY] = 1;
                        green--;
                        nextQueue.add(nextX * 1000 + nextY);
                    }
                }
            }

            days++;
            queue = nextQueue;
        }

        System.out.println(green == 0 ? days : -1);
    }
}
