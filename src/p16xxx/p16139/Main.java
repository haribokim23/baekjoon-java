package p16xxx.p16139;

// 제목 : 인간-컴퓨터 상호작용

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int length = s.length();
        int[][] count = new int[length + 1][26];

        for (int i = 0; i < length; i++) {
            System.arraycopy(count[i], 0, count[i + 1], 0, 26);
            count[i + 1][s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int q = Integer.parseInt(br.readLine()); q > 0; q--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            sb.append(count[Integer.parseInt(st.nextToken()) + 1][a] - count[l][a]).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
