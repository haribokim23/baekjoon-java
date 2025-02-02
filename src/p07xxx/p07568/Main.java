package p07xxx.p07568;

// 제목 : 덩치

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            hm.put(i, Integer.parseInt(st.nextToken()) * 1000 + Integer.parseInt(st.nextToken()));
        }
        br.close();

        for (int i = 0; i < n; i++) {
            int wi = hm.get(i) / 1000, hi = hm.get(i) % 1000;

            for (int j = 0; j < n; j++) {
                int wj = hm.get(j) / 1000, hj = hm.get(j) % 1000;

                if (wj > wi && hj > hi) {
                    arr[i]++;
                }
            }
        }

        for (int i : arr) {
            sb.append(i + 1).append(" ");
        }
        System.out.print(sb);
    }
}
