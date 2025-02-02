package p11xxx.p11724;

// 제목 : 연결 요소의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static ArrayList<ArrayList<Integer>> al;
    private static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        al = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            al.add(new ArrayList<>());
        }

        int m = Integer.parseInt(st.nextToken());

        if (m == 0) {
            System.out.println(n);
            return;
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            al.get(u).add(v);
            al.get(v).add(u);
        }

        br.close();
        visited = new boolean[n + 1];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                count++;
                dfs(i);
            }
        }

        System.out.println(count);
    }

    private static void dfs(int head) {
        for (int child : al.get(head)) {
            if (!visited[child]) {
                visited[child] = true;
                dfs(child);
            }
        }
    }
}
