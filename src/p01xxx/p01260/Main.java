package p01xxx.p01260;

// 제목 : DFS와 BFS

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private static HashMap<Integer, TreeSet<Integer>> hm;
    private static boolean[] visited;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        hm = new HashMap<>();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            hm.putIfAbsent(a, new TreeSet<>());
            hm.putIfAbsent(b, new TreeSet<>());
            hm.get(a).add(b);
            hm.get(b).add(a);
        }

        br.close();

        if (!hm.containsKey(v)) {
            System.out.println(v + "\n" + v);
            return;
        }

        visited = new boolean[n + 1];
        sb = new StringBuilder();
        dfs(v);
        sb.append("\n");
        visited = new boolean[n + 1];
        bfs(v);
        System.out.println(sb);
    }

    private static void dfs(int head) {
        visited[head] = true;
        sb.append(head).append(" ");

        for (int child : hm.get(head)) {
            if (!visited[child]) {
                dfs(child);
            }
        }
    }

    private static void bfs(int start) {
        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int head = queue.poll();
            sb.append(head).append(" ");

            for (int child : hm.get(head)) {
                if (!visited[child]) {
                    visited[child] = true;
                    queue.offer(child);
                }
            }
        }
    }
}
