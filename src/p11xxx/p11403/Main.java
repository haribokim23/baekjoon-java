package p11xxx.p11403;

// 제목 : 경로 찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] edges = new boolean[n][n];

        for (int row = 0; row < n; row++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int column = 0; column < n; column++) {
                edges[row][column] = st.nextToken().equals("1");
            }
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < n; row++) {
            boolean[] visits = new boolean[n];

            Queue<Integer> queue = new LinkedList<Integer>();
            queue.offer(row);

            while (!queue.isEmpty()) {
                int from = queue.poll();

                for (int to = 0; to < n; to++) {
                    if (edges[from][to] && !visits[to]) {
                        visits[to] = true;
                        queue.offer(to);
                    }
                }
            }

            for (boolean visit : visits) {
                sb.append(visit ? 1 : 0).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
