package p05xxx.p05430;

// 제목 : AC

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");

            ArrayDeque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean reverse = false;
            boolean error = false;

            for (int i = 0; i < p.length && !error; i++) {
                switch (p[i]) {
                    case 'R':
                        reverse ^= true;
                        break;
                    case 'D':
                        if (deque.isEmpty()) {
                            error = true;
                            break;
                        }

                        if (reverse) {
                            deque.removeLast();
                        } else {
                            deque.removeFirst();
                        }
                }
            }

            if (error) {
                sb.append("error\n");
            } else {
                Iterator<Integer> i = reverse ? deque.descendingIterator() : deque.iterator();
                sb.append("[");

                if (i.hasNext()) {
                    sb.append(i.next());
                }

                while (i.hasNext()) {
                    sb.append(",").append(i.next());
                }

                sb.append("]\n");
            }
        }

        br.close();
        System.out.print(sb);
    }
}
