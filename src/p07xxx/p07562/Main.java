package p07xxx.p07562;

// 제목 : 나이트의 이동

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int l = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            LinkedList<Integer> visits = new LinkedList<>();
            visits.offer(startX * l + startY);
            boolean[][] visited = new boolean[l][l];

            for (int moves = 0, moved = 0; moved == 0; moves++) {
                LinkedList<Integer> nextVisits = new LinkedList<>();

                while (!visits.isEmpty()) {
                    int current = visits.pop();
                    int currentX = current / l;
                    int currentY = current % l;

                    if (currentX == endX && currentY == endY) {
                        sb.append(moves).append("\n");
                        moved++;
                        break;
                    }

                    if (visited[currentX][currentY]) {
                        continue;
                    }

                    visited[currentX][currentY] = true;

                    for (int dx = -2; dx <= 2; dx++) {
                        if (dx == 0) {
                            continue;
                        }

                        for (int count = 0, dy = Math.abs(dx) - 3; count < 2; count++, dy *= -1) {
                            int nextX = currentX + dx;
                            int nextY = currentY + dy;
                            if (nextX >= 0 && nextX < l && nextY >= 0 && nextY < l
                                    && !visited[nextX][nextY]) {
                                nextVisits.add(nextX * l + nextY);
                            }
                        }
                    }
                }

                visits = nextVisits;
            }
        }

        br.close();
        System.out.print(sb);
    }
}
