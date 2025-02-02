package p09xxx.p09372;

// 제목 : 상근이의 여행

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) - 1).append("\n");

            for (int m = Integer.parseInt(st.nextToken()); m > 0; m--) {
                br.readLine();
            }
        }

        br.close();
        System.out.print(sb);
    }
}
