package p26xxx.p26069;

// 제목 : 붙임성 좋은 총총이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        hs.add("ChongChong");

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (hs.contains(a)) {
                hs.add(b);
            } else if (hs.contains(b)) {
                hs.add(a);
            }
        }

        br.close();
        System.out.println(hs.size());
    }
}
