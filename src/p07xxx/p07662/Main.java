package p07xxx.p07662;

// 제목 : 이중 우선순위 큐

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            PriorityQueue<Long> ascending = new PriorityQueue<>();
            PriorityQueue<Long> descending = new PriorityQueue<>(new DescendingComparator());
            HashMap<Long, Integer> count = new HashMap<>();
            int size = 0;

            while (k-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                long n = Long.parseLong(st.nextToken());

                if (s.equals("I")) {
                    ascending.offer(n);
                    descending.offer(n);
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    size++;
                } else {
                    if (n == 1) {
                        while (!descending.isEmpty()) {
                            long m = descending.poll();
                            int c = count.get(m);

                            if (c != 0) {
                                count.put(m, c - 1);
                                size--;
                                break;
                            }
                        }
                    } else {
                        while (!ascending.isEmpty()) {
                            long m = ascending.poll();
                            int c = count.get(m);

                            if (c != 0) {
                                count.put(m, c - 1);
                                size--;
                                break;
                            }
                        }
                    }
                }
            }

            if (size == 0) {
                sb.append("EMPTY\n");
                continue;
            }

            while (!descending.isEmpty()) {
                long m = descending.poll();
                int c = count.get(m);

                if (c != 0) {
                    sb.append(m).append(" ");
                    break;
                }

                count.put(m, c - 1);
            }

            while (!ascending.isEmpty()) {
                long m = ascending.poll();
                int c = count.get(m);

                if (c != 0) {
                    sb.append(m).append("\n");
                    break;
                }

                count.put(m, c - 1);
            }
        }

        br.close();
        System.out.print(sb);
    }

    private static class DescendingComparator implements Comparator<Long> {
        @Override
        public int compare(Long l1, Long l2) {
            return l2.compareTo(l1);
        }
    }
}
