package p01xxx.p01389;

// 제목 : 케빈 베이컨의 6단계 법칙

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
        boolean[][] areFriends = new boolean[n + 1][n + 1];

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            areFriends[a][b] = true;
            areFriends[b][a] = true;
        }

        int[][] distances = new int[n + 1][n + 1];

        for (int start = 1; start <= n; start++) {
            distances[start][start] = -1;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(start);

            for (int distance = 1; !queue.isEmpty(); distance++) {
                Queue<Integer> nextQueue = new LinkedList<>();

                while (!queue.isEmpty()) {
                    int from = queue.poll();

                    for (int to = 1; to <= n; to++) {
                        if (areFriends[from][to] && distances[start][to] == 0) {
                            distances[start][to] = distance;
                            nextQueue.offer(to);
                        }
                    }
                }

                queue = nextQueue;
            }
        }

        int minDistance = n * n;
        int minUser = 0;

        for (int from = 1; from <= n; from++) {
            distances[from][from] = 0;
            int sum = 0;

            for (int distance : distances[from]) {
                sum += distance;
            }

            if (sum < minDistance) {
                minDistance = sum;
                minUser = from;
            }
        }

        System.out.println(minUser);
    }
}
