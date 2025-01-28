package p09xxx.p09375;

// 제목 : 패션왕 신해빈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hm = new HashMap<>();

            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String category = st.nextToken();

                hm.putIfAbsent(category, 0);
                hm.put(category, hm.get(category) + 1);
            }

            int count = 1;

            for (String category : hm.keySet()) {
                count *= hm.get(category) + 1;
            }

            System.out.println(count - 1);
        }

        br.close();
    }
}
