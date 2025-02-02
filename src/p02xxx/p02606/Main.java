package p02xxx.p02606;

// 제목 : 바이러스

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine());
        boolean[][] network = new boolean[computers + 1][computers + 1];
        int pairs = Integer.parseInt(br.readLine());

        while (pairs-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int computer1 = Integer.parseInt(st.nextToken());
            int computer2 = Integer.parseInt(st.nextToken());
            network[computer1][computer2] = true;
            network[computer2][computer1] = true;
        }

        br.close();
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1);
        boolean[] visited = new boolean[computers + 1];

        while (!queue.isEmpty()) {
            int computer1 = queue.poll();

            if (visited[computer1]) {
                continue;
            }

            visited[computer1] = true;

            for (int computer2 = 1; computer2 < computers + 1; computer2++) {
                if (network[computer1][computer2] && !visited[computer2]) {
                    queue.offer(computer2);
                }
            }
        }

        visited[1] = false;
        int count = 0;

        for (boolean value : visited) {
            if (value) {
                count++;
            }
        }

        System.out.println(count);
    }
}
