package p16xxx.p16953;

// 제목 : A → B

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a == b) {
            System.out.println(1);
            return;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(a);
        int count = 2;
        boolean success = false;

        while (!queue.isEmpty()) {
            LinkedList<Integer> nextQueue = new LinkedList<>();

            while (!queue.isEmpty()) {
                int i = queue.poll();
                long times2 = (long) i * 2;

                if (times2 == b) {
                    success = true;
                    break;
                } else if (times2 < b) {
                    nextQueue.offer((int) times2);
                }

                long add1 = (long) i * 10 + 1;

                if (add1 == b) {
                    success = true;
                    break;
                } else if (add1 < b) {
                    nextQueue.offer((int) add1);
                }
            }

            if (success) {
                break;
            }

            count++;
            queue = nextQueue;
        }

        System.out.println(success ? count : -1);
    }
}
