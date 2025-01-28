package p03xxx.p03047;

// 제목 : ABC

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] abc = new int[3];
        abc[0] = Integer.parseInt(st.nextToken());
        abc[1] = Integer.parseInt(st.nextToken());
        abc[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(abc);
        String order = br.readLine();
        br.close();

        for (int i = 0; i < 3; i++) {
            System.out.print(abc[order.charAt(i) - 'A'] + " ");
        }
    }
}
