package p24xxx.p24480;

// 제목 : 알고리즘 수업 - 깊이 우선 탐색 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private static HashMap<Integer, TreeSet<Integer>> edges;
    private static int[] orders;
    private static int order;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        edges = new HashMap<Integer, TreeSet<Integer>>();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            edges.putIfAbsent(u, new TreeSet<Integer>(Comparator.reverseOrder()));
            edges.putIfAbsent(v, new TreeSet<Integer>(Comparator.reverseOrder()));
            edges.get(u).add(v);
            edges.get(v).add(u);
        }

        br.close();
        orders = new int[n];
        order = 1;
        dfs(r);

        for (int index = 0; index < n; index++) {
            System.out.println(orders[index]);
        }
    }

    private static void dfs(int from) {
        orders[from - 1] = order++;

        for (int to : edges.getOrDefault(from, new TreeSet<>())) {
            if (orders[to - 1] == 0) {
                dfs(to);
            }
        }
    }
}
