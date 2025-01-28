package p11xxx.p11725;

// 제목 : 트리의 부모 찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            al.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            al.get(a).add(b);
            al.get(b).add(a);
        }

        br.close();

        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1);
        int[] parents = new int[n + 1];
        parents[1] = -1;

        while (!queue.isEmpty()) {
            int parent = queue.poll();

            for (int child : al.get(parent)) {
                if (parents[child] != 0) {
                    continue;
                }

                queue.offer(child);
                parents[child] = parent;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= n; i++) {
            sb.append(parents[i]).append("\n");
        }

        System.out.print(sb);
    }
}
