package p24xxx.p24445;

// 제목 : 알고리즘 수업 - 너비 우선 탐색 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(r);
        orders = new int[n];
        order = 1;

        while (!queue.isEmpty()) {
            int from = queue.poll();

            if (orders[from - 1] != 0) {
                continue;
            }

            orders[from - 1] = order++;

            for (int to : edges.getOrDefault(from, new TreeSet<Integer>())) {
                if (orders[to - 1] == 0) {
                    queue.offer(to);
                }
            }
        }

        for (int index = 0; index < n; index++) {
            System.out.println(orders[index]);
        }
    }
}
