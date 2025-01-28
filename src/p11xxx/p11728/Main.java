package p11xxx.p11728;

// 제목 : 배열 합치기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        LinkedList<Integer> a = new LinkedList<>();

        while (n-- > 0) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        br.close();
        LinkedList<Integer> b = new LinkedList<>();

        while (m-- > 0) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();

        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.peek() < b.peek()) {
                sb.append(a.remove()).append(" ");
            } else {
                sb.append(b.remove()).append(" ");
            }
        }

        if (a.isEmpty()) {
            a = b;
        }

        while (!a.isEmpty()) {
            sb.append(a.remove()).append(" ");
        }

        System.out.println(sb);
    }
}
