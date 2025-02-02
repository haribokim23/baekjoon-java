package p01xxx.p01927;

// 제목 : 최소 힙

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                sb.append(queue.size() > 0 ? queue.poll() : 0).append("\n");
                continue;
            }

            queue.offer(x);
        }

        br.close();
        System.out.print(sb);
    }
}
