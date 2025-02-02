package p24xxx.p24479;

// 제목 : 알고리즘 수업 - 깊이 우선 탐색 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private static HashMap<Integer, TreeSet<Integer>> vertices;
    private static int[] order;
    private static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        vertices = new HashMap<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            vertices.putIfAbsent(u, new TreeSet<>());
            vertices.putIfAbsent(v, new TreeSet<>());
            vertices.get(u).add(v);
            vertices.get(v).add(u);
        }

        br.close();
        order = new int[n];
        count = 1;
        dfs(r);

        for (int i = 0; i < n; i++) {
            System.out.println(order[i]);
        }
    }

    private static void dfs(int root) {
        order[root - 1] = count++;

        for (int vertex : vertices.getOrDefault(root, new TreeSet<>())) {
            if (order[vertex - 1] == 0) {
                dfs(vertex);
            }
        }
    }
}
