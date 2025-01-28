package p01xxx.p01418;

// 제목 : K-세준수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        br.close();
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 2; i <= n; i++) {
            numbers.add(i);
        }

        for (int i = 2; i <= k; i++) {
            for (ListIterator<Integer> li = numbers.listIterator(); li.hasNext(); ) {
                int next = li.next();

                while (next % i == 0) {
                    next /= i;
                }

                if (next == 1) {
                    li.remove();
                } else {
                    li.set(next);
                }
            }
        }

        numbers.removeIf(integer -> integer == 1);
        System.out.println(n - numbers.size());
    }
}
