package p11xxx.p11651;

// 제목 : 좌표 정렬하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long[] xy = new long[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) + 100000, y = Integer.parseInt(st.nextToken())
                    + 100000;
            xy[i] = (long) y * 1000000 + x;
        }

        br.close();
        Arrays.sort(xy);
        StringBuilder sb = new StringBuilder();

        for (long l : xy) {
            sb.append(l % 1000000 - 100000).append(" ").append(l / 1000000 - 100000).append("\n");
        }

        System.out.print(sb);
    }
}
