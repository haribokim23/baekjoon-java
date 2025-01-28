package p11xxx.p11279;

// 제목 : 최대 힙

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(new DescendingComparator());
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

    private static class DescendingComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer i1, Integer i2) {
            return i2 - i1;
        }
    }
}
