package p14xxx.p14215;

// 제목 : 세 막대

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = a + b + c;
        int max = Math.max(Math.max(a, b), c);

        if (max >= sum - max) {
            sum = (sum - max) * 2 - 1;
        }

        System.out.println(sum);
    }
}
