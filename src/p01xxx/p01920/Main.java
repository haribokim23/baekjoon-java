package p01xxx.p01920;

// 제목 : 수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hs = new HashSet<Integer>();

        while (n-- > 0) {
            hs.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            sb.append(hs.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
        }

        System.out.print(sb);
    }
}
