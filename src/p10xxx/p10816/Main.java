package p10xxx.p10816;

// 제목 : 숫자 카드 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());

            if (hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        br.close();

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            if (hm.containsKey(key)) {
                sb.append(hm.get(key));
            } else {
                sb.append(0);
            }

            sb.append(" ");
        }

        System.out.println(sb);
    }
}
