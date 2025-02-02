package p11xxx.p11723;

// 제목 : 집합

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        boolean[] set = new boolean[21];
        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "add":
                    set[Integer.parseInt(st.nextToken())] = true;
                    break;
                case "remove":
                    set[Integer.parseInt(st.nextToken())] = false;
                    break;
                case "check":
                    sb.append(set[Integer.parseInt(st.nextToken())] ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    int x = Integer.parseInt(st.nextToken());
                    set[x] = !set[x];
                    break;
                case "all":
                    Arrays.fill(set, true);
                    break;
                case "empty":
                    Arrays.fill(set, false);
                    break;
            }
        }

        br.close();
        System.out.print(sb);
    }
}
