package p01xxx.p01021;

// 제목 : 회전하는 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> queue = new LinkedList<Integer>();

        while (n > 0) {
            queue.addFirst(n--);
        }

        st = new StringTokenizer(br.readLine());
        int count = 0;

        while (m-- > 0) {
            int a = Integer.parseInt(st.nextToken());

            if (queue.indexOf(a) <= queue.size() / 2) {
                while (queue.peek() != a) {
                    queue.addLast(queue.removeFirst());
                    count++;
                }
            } else {
                while (queue.peek() != a) {
                    queue.addFirst(queue.removeLast());
                    count++;
                }
            }

            queue.removeFirst();
        }

        br.close();
        System.out.println(count);
    }
}
