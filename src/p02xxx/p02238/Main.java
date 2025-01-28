package p02xxx.p02238;

// 제목 : 경매

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] counts = new int[u];
        String[] names = new String[u];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int p = Integer.parseInt(st.nextToken()) - 1;
            counts[p]++;

            if (names[p] == null) {
                names[p] = s;
            }
        }

        br.close();
        int index = 0;

        for (int i = 0, min = n; i < u; i++) {
            int count = counts[i];

            if (count != 0 && count < min) {
                min = count;
                index = i;
            }
        }

        System.out.println(names[index] + " " + (index + 1));
    }
}
