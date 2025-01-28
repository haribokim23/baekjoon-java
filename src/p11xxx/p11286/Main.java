package p11xxx.p11286;

// 제목 : 절댓값 힙

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> positive = new PriorityQueue<>();
        PriorityQueue<Integer> negative = new PriorityQueue<>(new DescendingComparator());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                int min = 0;

                if (positive.size() > 0) {
                    if (negative.size() > 0) {
                        min = positive.peek() < Math.abs(negative.peek()) ? positive.poll()
                                : negative.poll();
                    } else {
                        min = positive.poll();
                    }
                } else if (negative.size() > 0) {
                    min = negative.poll();
                }

                sb.append(min).append("\n");
                continue;
            }

            if (x > 0) {
                positive.offer(x);
                continue;
            }

            negative.offer(x);
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
