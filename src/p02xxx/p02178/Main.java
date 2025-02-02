package p02xxx.p02178;

// 제목 : 미로 탐색

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] maze = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            ;

            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j);
            }
        }

        br.close();
        LinkedList<Integer> visits = new LinkedList<>();
        visits.add(0);
        boolean[][] visited = new boolean[n][m];

        for (int moves = 1; ; moves++) {
            LinkedList<Integer> nextVisits = new LinkedList<>();

            for (Iterator<Integer> iterator = visits.iterator(); iterator.hasNext(); ) {
                int current = iterator.next();
                iterator.remove();
                int currentX = current / 1000;
                int currentY = current % 1000;

                if (currentX == n - 1 && currentY == m - 1) {
                    System.out.println(moves);
                    return;
                }

                if (visited[currentX][currentY]) {
                    continue;
                }

                visited[currentX][currentY] = true;

                for (int d : new int[]{1, -1, -10, 10}) {
                    int nextX = currentX + d / 10;
                    int nextY = currentY + d % 10;

                    if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m
                            && maze[nextX][nextY] == '1' && !visited[nextX][nextY]) {
                        nextVisits.add(nextX * 1000 + nextY);
                    }
                }
            }

            visits = nextVisits;
        }
    }
}
