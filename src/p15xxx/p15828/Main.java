package p15xxx.p15828;

// 제목 : Router

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = Integer.parseInt(br.readLine()); i >= 0; i = Integer.parseInt(br.readLine())) {
            if (i > 0) {
                if (queue.size() < n) {
                    queue.addLast(i);
                }
            } else {
                queue.removeFirst();
            }
        }

        br.close();

        if (queue.size() == 0) {
            System.out.println("empty");
        }

        StringBuilder sb = new StringBuilder();

        for (int i : queue) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
