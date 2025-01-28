package p01xxx.p01697;

// 제목 : 숨바꼭질

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            return;
        }

        boolean found = false;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(n);
        boolean[] visited = new boolean[100_001];
        visited[n] = true;
        int seconds = 1;

        while (!queue.isEmpty()) {
            LinkedList<Integer> nextQueue = new LinkedList<>();

            while (!queue.isEmpty()) {
                int position = queue.poll();
                int minus1 = position - 1;
                int plus1 = position + 1;
                int times2 = position * 2;

                if (minus1 == k || plus1 == k || times2 == k) {
                    found = true;
                    break;
                }

                if (minus1 >= 0 && minus1 <= 100_000 && !visited[minus1]) {
                    visited[minus1] = true;
                    nextQueue.offer(minus1);
                }

                if (plus1 >= 0 && plus1 <= 100_000 && !visited[plus1]) {
                    visited[plus1] = true;
                    nextQueue.offer(plus1);
                }

                if (times2 >= 0 && times2 <= 100_000 && !visited[times2]) {
                    visited[times2] = true;
                    nextQueue.offer(times2);
                }
            }

            if (found) {
                break;
            }

            seconds++;
            queue = nextQueue;
        }

        System.out.println(seconds);
    }
}
