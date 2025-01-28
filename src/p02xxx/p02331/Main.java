package p02xxx.p02331;

// 제목 : 반복수열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; ; ) {
            Integer index = hm.get(a);

            if (index != null) {
                System.out.println(index);
                return;
            }

            hm.put(a, i++);
            int nextA = 0;

            while (a > 0) {
                nextA += Math.pow(a % 10, p);
                a /= 10;
            }

            a = nextA;
        }
    }
}
