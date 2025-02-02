package p01xxx.p01406;

// 제목 : 에디터

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int length = string.length();
        LinkedList<Character> ll = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            ll.add(string.charAt(i));
        }

        ListIterator<Character> li = ll.listIterator(length);
        int m = Integer.parseInt(br.readLine());

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "L":
                    if (li.hasPrevious()) {
                        li.previous();
                    }

                    break;
                case "D":
                    if (li.hasNext()) {
                        li.next();
                    }

                    break;
                case "B":
                    if (li.hasPrevious()) {
                        li.previous();
                        li.remove();
                    }

                    break;
                case "P":
                    li.add(st.nextToken().charAt(0));
                    break;
            }
        }

        br.close();
        StringBuilder sb = new StringBuilder();
        li = ll.listIterator();

        while (li.hasNext()) {
            sb.append(li.next());
        }

        System.out.println(sb);
    }
}
