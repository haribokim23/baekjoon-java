package p10xxx.p10807;

// 제목 : 개수 세기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] count = new int[201];

        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(st.nextToken()) + 100]++;
        }

        System.out.println(count[Integer.parseInt(br.readLine()) + 100]);
        br.close();
    }
}
