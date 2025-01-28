package p01xxx.p01158;

// 제목 : 요세푸스 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            ll.addLast(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (--N > 0) {
            for (int i = 0; i < K - 1; i++) {
                ll.addLast(ll.removeFirst());
            }

            sb.append(ll.removeFirst()).append(", ");
        }

        sb.append(ll.getFirst()).append(">");
        System.out.println(sb);
    }
}
