package p07xxx.p07785;

// 제목 : 회사에 있는 사람

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if (st.nextToken().equals("enter")) {
                hs.add(name);
            } else {
                hs.remove(name);
            }
        }

        br.close();
        String[] array = hs.toArray(new String[0]);
        Arrays.sort(array, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (String s : array) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}
