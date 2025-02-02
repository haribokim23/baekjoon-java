package p10xxx.p10866;

// 제목 : 덱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> deque = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            boolean newLine = true;

            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    newLine = false;
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    newLine = false;
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? -1 : deque.removeFirst());
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? -1 : deque.removeLast());
                    break;
                case "size":
                    sb.append(deque.size());
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? -1 : deque.getFirst());
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? -1 : deque.getLast());
                    break;
                default:
                    sb.append("ERROR");
                    break;
            }

            if (newLine) {
                sb.append("\n");
            }
        }

        br.close();
        System.out.print(sb);
    }
}
